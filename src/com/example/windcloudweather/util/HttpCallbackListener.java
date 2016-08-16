package com.example.windcloudweather.util;

/**
 * Created by liaoxiwei on 2016/8/9.
 */
public interface HttpCallbackListener {

        void onFinish(String response);

        void onError(Exception e);


}
