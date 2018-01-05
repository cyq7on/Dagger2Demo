package com.cyq7on.dagger2demo.component;

import com.cyq7on.dagger2demo.model.ClothHandler;
import com.cyq7on.dagger2demo.module.BaseModule;
import com.cyq7on.dagger2demo.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by cyq7on on 2018/1/4.
 */
@Singleton //对应Module中声明的单例
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();

    SubMainComponent getSubMainComponent(MainModule module);
}
