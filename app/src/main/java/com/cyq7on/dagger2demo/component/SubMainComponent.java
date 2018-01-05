package com.cyq7on.dagger2demo.component;

import com.cyq7on.dagger2demo.MainActivity;
import com.cyq7on.dagger2demo.MySingleton;
import com.cyq7on.dagger2demo.module.MainModule;

import dagger.Subcomponent;

/**
 * Created by cyq7on on 2018/1/5.
 */
@Subcomponent(modules = MainModule.class)
@MySingleton
public interface SubMainComponent {
    void inject(MainActivity activity);
}
