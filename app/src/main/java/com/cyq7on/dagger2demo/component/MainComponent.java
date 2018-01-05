package com.cyq7on.dagger2demo.component;

import com.cyq7on.dagger2demo.MainActivity;
import com.cyq7on.dagger2demo.MySingleton;
import com.cyq7on.dagger2demo.module.MainModule;

import dagger.Component;

/**
 * Created by cyq7on on 2018/1/4.
 */
@Component(modules = MainModule.class,dependencies = BaseComponent.class)
@MySingleton
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
