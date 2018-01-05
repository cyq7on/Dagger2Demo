package com.cyq7on.dagger2demo;

import android.app.Application;

import com.cyq7on.dagger2demo.component.BaseComponent;
import com.cyq7on.dagger2demo.component.DaggerBaseComponent;
import com.cyq7on.dagger2demo.module.BaseModule;

/**
 * Created by cyq7on on 2018/1/4.
 */

public class MyApplication extends Application {
    private BaseComponent baseComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        baseComponent = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }

}
