package com.example.windcloudweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.example.windcloudweather.service.AutoUpdateService;

/**
 * Created by liaoxiwei on 2016/8/17.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);

    }

}
