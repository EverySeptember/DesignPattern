package com.lu.files;

import com.lu.File;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:40
 */
public class Markdown extends File {

    public Markdown(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("一个Markdown：" + this.getName());
    }
}
