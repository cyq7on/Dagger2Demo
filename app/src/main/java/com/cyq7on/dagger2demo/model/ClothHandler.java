package com.cyq7on.dagger2demo.model;

/**
 * Created by cyq7on on 2018/1/4.
 */

public class ClothHandler {
    public Clothes handle(Cloth cloth){
        return new Clothes(cloth);
    }
}
