package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 20:06
 */
public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.buildLamborghini();
        Car lamborghini = carBuilder.build();
        lamborghini.run();

        carBuilder.buildWuling();
        Car wuling = carBuilder.build();
        wuling.run();
    }
}
