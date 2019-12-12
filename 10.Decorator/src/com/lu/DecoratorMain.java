package com.lu;

import com.lu.parts.*;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 13:25
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Computer apple = new Apple();
        apple = new CPU(apple);
        apple = new GPU(apple);
        apple = new MotherBoard(apple);
        apple = new RAM(apple);
        apple = new RAM(apple);
        apple = new RAM(apple);
        apple = new RAM(apple);
        apple = new ROM(apple);
        apple = new ROM(apple);


        System.out.println(apple.getDescription());
        System.out.println(String.format("总价：%.2f", apple.cost()));

    }
}
