package com.weather.android.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport{
    private int id;
    private String cityName;//记录城市的名字
    private int provinceId;//记录当前城市所属省的id
    private int cityCode;//记录城市的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
