package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 21:08
 */
public abstract class Car {
    protected String name;

    public void run() {
        this.setParameter();
        System.out.println(this.name + "跑起来了");
    }

    public abstract void setParameter();
}
