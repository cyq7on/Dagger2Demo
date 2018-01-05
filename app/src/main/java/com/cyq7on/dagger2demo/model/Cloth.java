package com.cyq7on.dagger2demo.model;

/**
 * Created by cyq7on on 2018/1/4.
 作者：zFxiang_
 链接：https://www.jianshu.com/p/1d84ba23f4d2
 來源：简书
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

public class Cloth {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "布料";
    }

}
