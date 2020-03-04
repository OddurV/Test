package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Vessel {
    private final String name;
    private Date date;
    private Date receivedDate = new Date();
    private double latitude;
    private double longitude;
    private double speed;

    public Vessel(@JsonProperty("name") String name,
                  @JsonProperty("date") Date date,
                  Date receivedDate,
                  @JsonProperty("latitude") double latitude,
                  @JsonProperty("longitude") double longitude,
                  @JsonProperty("speed") double speed) {
        this.name = name;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
    }

    public String getName(){
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getSpeed() {
        return speed;
    }

    public void setReceivedDate(Date date){
        this.receivedDate = date;
    }
}
