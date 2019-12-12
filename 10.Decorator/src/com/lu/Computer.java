package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 16:26
 */
public abstract class Computer {
    protected String description;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
