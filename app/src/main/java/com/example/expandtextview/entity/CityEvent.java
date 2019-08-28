package com.example.expandtextview.entity;

/**
 * @作者: njb
 * @时间: 2019/8/28 18:20
 * @描述:
 */
public class CityEvent {
    private String id;
    private String cityName;

    public CityEvent(String id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
