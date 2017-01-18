package com.baseapp;


import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.orhanobut.hawk.Hawk;

import org.greenrobot.eventbus.EventBus;

public class XApplication extends MultiDexApplication {


    private static XApplication instance = null;
    public static XApplication getInstance() {
        return instance;
    }


    /**
     * 低版本 dex 兼容问题
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        Hawk.init(this).build();

        EventBus.builder().build();

    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();

        instance = this;
    }
}

