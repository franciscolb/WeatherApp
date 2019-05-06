package com.francisco.weather;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

    
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {  
        return args -> {
            Locations locs = restTemplate.getForObject("http://api.ipma.pt/open-data/distrits-islands.json", Locations.class);
            for(Place x : locs.getData()) {
                Cache.locations.put(x.getGlobalIdLocal(), x);
            }
        };
    }
}
