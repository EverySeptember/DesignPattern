package com.lu.ingredients;

import com.lu.EdibleOil;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:09
 */
public class RapeseedOil implements EdibleOil {
    @Override
    public void fry() {
        System.out.println("使用菜籽油炒了");
    }
}
