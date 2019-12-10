package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 13:18
 */
public abstract class Filter {
    protected String name;

    public void create(String name) {
        this.name = name;
    }

    public abstract boolean hadleData();
}
