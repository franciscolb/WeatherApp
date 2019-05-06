package com.francisco.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String precipitaProb;
    private String tMin;
    private String tMax;
    private String predWindDir;
    private int idWeatherType;
    private int classWindSpeed;
    private String longitude;
    private String forecastDate;
    private String classPrecInt;
    private String latitude;

    public String getPrecipitaProb() {
        return precipitaProb;
    }

    public void setPrecipitaProb(String precipitaProb) {
        this.precipitaProb = precipitaProb;
    }

    public String gettMin() {
        return tMin;
    }

    public void settMin(String tMin) {
        this.tMin = tMin;
    }

    public String gettMax() {
        return tMax;
    }

    public void settMax(String tMax) {
        this.tMax = tMax;
    }

    public String getPredWindDir() {
        return predWindDir;
    }

    public void setPredWindDir(String predWindDir) {
        this.predWindDir = predWindDir;
    }

    public int getIdWeatherType() {
        return idWeatherType;
    }

    public void setIdWeatherType(int idWeatherType) {
        this.idWeatherType = idWeatherType;
    }

    public int getClassWindSpeed() {
        return classWindSpeed;
    }

    public void setClassWindSpeed(int classWindSpeed) {
        this.classWindSpeed = classWindSpeed;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public String getClassPrecInt() {
        return classPrecInt;
    }

    public void setClassPrecInt(String classPrecInt) {
        this.classPrecInt = classPrecInt;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Forecast{" + "precipitaProb=" + precipitaProb + ", tMin=" + tMin + ", tMax=" + tMax + ", predWindDir=" + predWindDir + ", idWeatherType=" + idWeatherType + ", classWindSpeed=" + classWindSpeed + ", longitude=" + longitude + ", forecastDate=" + forecastDate + ", classPrecInt=" + classPrecInt + ", latitude=" + latitude + '}';
    }
}
