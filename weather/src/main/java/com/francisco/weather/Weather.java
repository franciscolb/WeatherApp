package com.francisco.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private String owner;
    private String country;
    private Forecast[] data;
    private int globalIdLocal;
    private String dataUpdate;
    private long time;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Weather() {
    }
    
    public int getGlobalIdLocal() {
        return globalIdLocal;
    }

    public void setGlobalIdLocal(int globalIdLocal) {
        this.globalIdLocal = globalIdLocal;
    }

    public String getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(String dataUpdate) {
        this.dataUpdate = dataUpdate;
    }
    
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

    public Forecast[] getData() {
        return data;
    }

    public void setData(Forecast[] data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Weather{" + "owner=" + owner + ", country=" + country + ", data=" + data[0] + '}';
    }
}
