package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 10:55
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
