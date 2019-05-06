package com.francisco.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Locations {
    private String owner;
    private String country;
    private Place[] data;

    
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Place[] getData() {
        return data;
    }

    public void setData(Place[] data) {
        this.data = data;
    }
    
    
}
