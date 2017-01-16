package com.com.baseapp;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

public class XApplication extends Application {


    private static XApplication instance = null;

    private int vsersioncode = 0;

    public static XApplication getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

      //  Hawk.init(this).build();

        EventBus.builder().build();

    }


}

}
