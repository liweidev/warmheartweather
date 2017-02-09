package com.warmheartweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liwei on 2017/2/9.
 */

public class Forecast {

    @SerializedName("cond")
    public More more;

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;


    public class Temperature{
        public String max;
        public String min;
    }


    public class More{
        @SerializedName("txt_d")
        public String info;


    }



}
