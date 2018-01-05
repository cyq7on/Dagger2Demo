package com.cyq7on.dagger2demo.module;

import com.cyq7on.dagger2demo.MySingleton;
import com.cyq7on.dagger2demo.model.Cloth;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cyq7on on 2018/1/4.
 */
@Module
public class SecondModule {

    @Provides
    @MySingleton
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

}
