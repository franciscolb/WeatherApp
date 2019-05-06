package com.francisco.weather;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Cache {
    protected static final Map<Integer,Weather> weather = new HashMap<>();
    protected static final Map<Integer,Place> locations = new HashMap<>();
    private static int nRequests = 0;
    
    @Autowired
    CommandLineRunner run;
    
    public static void setWeather(Integer id,Weather weather){
        weather.setTime(System.currentTimeMillis());
        Cache.weather.put(id, weather);
        Cache.nRequests++;
    }
    
    public static int getNrRequests(){
        return Cache.nRequests;
    }
    
    
}
