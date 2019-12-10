package com.lu;

import com.lu.product.Lamborghini;
import com.lu.product.Wuling;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 21:07
 */
public class CarBuilder {
    Car car;

    public void buildWuling() {
        this.car = new Wuling();
    }

    public void buildLamborghini() {
        this.car = new Lamborghini();
    }

    public Car build() {
        return this.car;
    }
}
