package com.warmheartweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liwei on 2017/2/9.
 * 根据服务器返回的json字段，创建对应的实体类
 * basic字段
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }




}
