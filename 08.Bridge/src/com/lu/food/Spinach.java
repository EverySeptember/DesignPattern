package com.lu.food;

import com.lu.Vegitables;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:06
 */
public class Spinach extends Vegitables {
    @Override
    public void cook() {
        this.edibleOil.fry();
        System.out.println("菠菜");
    }
}
