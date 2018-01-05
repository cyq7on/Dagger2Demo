package com.cyq7on.dagger2demo.model;

/**
 * Created by cyq7on on 2018/1/4.
 */

public class Clothes {
    private Cloth cloth;

    public Clothes(Cloth cloth) {
        this.cloth = cloth;
    }

    public Cloth getCloth() {
        return cloth;
    }

    @Override
    public String toString() {
        return cloth.getColor() + "衣服";
    }

}
