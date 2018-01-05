package com.cyq7on.dagger2demo.module;

import com.cyq7on.dagger2demo.MySingleton;
import com.cyq7on.dagger2demo.model.Cloth;
import com.cyq7on.dagger2demo.model.Clothes;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cyq7on on 2018/1/4.
 */
@Module
public class MainModule {
    @Provides
    @Named("red")
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @Named("blue")
    @MySingleton
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    public Clothes getClothes(@Named("blue") Cloth cloth){
        return new Clothes(cloth);
    }
}
