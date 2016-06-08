package com.example.ubuntu.coolweather.util;

/**
 * Created by ubuntu on 16-6-8.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
