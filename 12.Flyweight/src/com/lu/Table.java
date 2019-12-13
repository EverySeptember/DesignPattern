package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/13 10:34
 */
public abstract class Table {
    protected String name;

    public Table(String name) {
        this.name = name;
    }

    public abstract void getTable();
}
