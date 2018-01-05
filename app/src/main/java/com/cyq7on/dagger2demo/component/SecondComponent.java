package com.cyq7on.dagger2demo.component;

import com.cyq7on.dagger2demo.MySingleton;
import com.cyq7on.dagger2demo.SecondActivity;
import com.cyq7on.dagger2demo.module.SecondModule;

import dagger.Component;

/**
 * Created by cyq7on on 2018/1/4.
 */
@Component(modules = SecondModule.class,dependencies = BaseComponent.class)
@MySingleton
public interface SecondComponent {
    void inject(SecondActivity secondActivity);
}
