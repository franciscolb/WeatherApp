package com.francisco.weather;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/weather/{id}")
    public Weather weather(@PathVariable Integer id){
        if(!Cache.weather.containsKey(id))
            this.refresh(id);
        if(System.currentTimeMillis() - Cache.weather.get(id).getTime() > 300000){
            this.refresh(id);
            System.out.println("REFRESH");
        }
        return Cache.weather.get(id);
    }
    
    private void refresh(int id){
        Weather weather = restTemplate.getForObject(
                    "http://api.ipma.pt/open-data/forecast/meteorology/cities/daily/"+ id +".json", Weather.class);
            Cache.setWeather(id,weather);
    }
    
    @RequestMapping("/places")
    public Map<Integer,Place> places(){
        return Cache.locations;
    }
}
