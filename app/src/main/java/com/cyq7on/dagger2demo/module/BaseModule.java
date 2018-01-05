package com.cyq7on.dagger2demo.module;

import com.cyq7on.dagger2demo.model.ClothHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cyq7on on 2018/1/4.
 */
@Module
public class BaseModule {

    @Singleton //单例
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
