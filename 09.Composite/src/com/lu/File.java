package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:34
 */
public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
