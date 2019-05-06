package com.francisco.weather;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherApplication {

    private static final Logger log = LoggerFactory.getLogger(WeatherApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {  
        return args -> {
            Weather weather = restTemplate.getForObject(
                    "http://api.ipma.pt/open-data/forecast/meteorology/cities/daily/1010500.json", Weather.class);
            log.info(weather.toString());
            Cache.setWeather(1010500,weather);
            
            Locations locs = restTemplate.getForObject("http://api.ipma.pt/open-data/distrits-islands.json", Locations.class);
            for(Place x : locs.getData()) {
                Cache.locations.put(x.getGlobalIdLocal(), x);
            }
        };
    }
}
