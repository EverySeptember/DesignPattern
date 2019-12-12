package com.lu;

import com.lu.food.Potato;
import com.lu.food.Spinach;
import com.lu.ingredients.PeanutOil;
import com.lu.ingredients.RapeseedOil;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 15:51
 */
public class BridgeMain {

    public static void main(String[] args) {
        EdibleOil peanutOil = new PeanutOil();
        Vegitables potato = new Potato();

        potato.setEdibleOil(peanutOil);
        potato.cook();

        EdibleOil rapeseedOil = new RapeseedOil();
        Vegitables spinach = new Spinach();

        spinach.setEdibleOil(rapeseedOil);
        spinach.cook();
    }
}
