package com.warmheartweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by liwei on 2017/2/8.
 * 县
 */

public class County extends DataSupport{

    private int id;
    private String countyName;//县
    private String weatherId;//当前县所对应的天气ID
    private int cityId;//所属城市ID

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {

        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }
}
