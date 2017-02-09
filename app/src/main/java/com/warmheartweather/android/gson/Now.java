package com.warmheartweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liwei on 2017/2/9.
 */

public class Now {

    @SerializedName("tmp") /*"tmp":"2"*/
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")  /*"txt":"晴"*/
        public String info;

    }


}
