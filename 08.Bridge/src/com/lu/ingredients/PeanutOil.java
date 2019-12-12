package com.lu.ingredients;

import com.lu.EdibleOil;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:08
 */
public class PeanutOil implements EdibleOil {
    @Override
    public void fry() {
        System.out.println("使用花生油炒了");
    }
}
