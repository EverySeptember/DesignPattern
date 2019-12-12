package com.lu.food;

import com.lu.Vegitables;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:05
 */
public class Potato extends Vegitables {
    @Override
    public void cook() {
        this.edibleOil.fry();
        System.out.println("土豆");
    }
}
