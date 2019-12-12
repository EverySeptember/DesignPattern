package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 14:42
 */
public class Apple extends Computer {

    private static final Double PRICE = 12000d;

    public Apple() {
        this.description = String.format("MacPro本机：%.2f", PRICE);
    }

    @Override
    public double cost() {
        return PRICE;
    }
}
