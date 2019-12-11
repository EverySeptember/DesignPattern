package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 10:59
 */
public enum EnumSingleton {
    /**
     * 单例
     */
    INSTANCE(0, "单例");

    int code;
    String name;
    EnumSingleton(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
