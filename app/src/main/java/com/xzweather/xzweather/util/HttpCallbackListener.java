package com.xzweather.xzweather.util;

/**
 * Created by Administrator on 2016/7/29.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}