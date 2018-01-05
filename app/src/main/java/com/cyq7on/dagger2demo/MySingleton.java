package com.cyq7on.dagger2demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by cyq7on on 2018/1/4.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingleton {
}
