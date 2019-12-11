package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 10:52
 */
public class SingletonMain {
    public static void main(String[] args) {
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
    }
}
