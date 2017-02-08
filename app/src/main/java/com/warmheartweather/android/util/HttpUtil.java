package com.warmheartweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by liwei on 2017/2/8.
 * 发送网络请求的工具类
 */

public class HttpUtil {

    /**
     * 调用此方法发送网络请求,基于回掉函数处理响应数据
     * @param address 请求地址
     * @param callback 回掉函数
     */
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
