package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 20:59
 */
public class FlyweightMain {

    public static void main(String[] args) {
        TableFactory factory = new TableFactory();
        factory.getTable("1");
        factory.getTable("1");
        factory.getTable("2");
        factory.getTable("3");
        factory.getTable("3");
        factory.getTable("3");
        factory.getTable("3");
        factory.getTable("4");
        factory.getTable("4");

        System.out.println(factory.getSize());
    }
}
