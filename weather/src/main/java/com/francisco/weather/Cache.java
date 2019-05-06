package com.francisco.weather;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.client.RestTemplate;

public class Cache {
    public static Map<Integer,Weather> weather = new HashMap<>();
    public static Map<Integer,Place> locations = new HashMap<>();
    public static int nRequests = 0;
    
    @Autowired
    CommandLineRunner run;
    
    public static void setWeather(Integer id,Weather weather){
        weather.setTime(System.currentTimeMillis());
        Cache.weather.put(id, weather);
        Cache.nRequests++;
    }
    
    
}
