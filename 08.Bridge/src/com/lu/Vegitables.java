package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 15:53
 */
public abstract class Vegitables {
    protected EdibleOil edibleOil;

    public void setEdibleOil(EdibleOil edibleOil) {
        this.edibleOil = edibleOil;
    }

    public abstract void cook();
}
