package com.francisco.weather;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherApplicationTests {

        @Test
        public void testCache(){
            Weather w = new Weather();
            w.setCountry("PT");
            //1010500 is the globalId for Aveiro
            Cache.setWeather(1010500, w);
            Weather w2 = Cache.weather.get(1010500);
            Assert.assertEquals(w2.getCountry(),w.getCountry());
        }
        
        @Test
        public void testCacheNrRequests(){
            Weather w = new Weather();
            w.setCountry("PT");
            //1010500 is the globalId for Aveiro
            Cache.setWeather(1010500, w);
            Weather w2 = Cache.weather.get(1010500);
            Assert.assertEquals(Cache.getNrRequests(), 2);
        }
}
