package com.cyq7on.dagger2demo.model;

import javax.inject.Inject;

/**
 * Created by cyq7on on 2018/1/4.
 */

public class Shoe {
    @Inject
    public Shoe() {
    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
