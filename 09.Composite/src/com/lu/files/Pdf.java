package com.lu.files;

import com.lu.File;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 13:04
 */
public class Pdf extends File {

    public Pdf(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("一个PDF：" + this.getName());
    }
}
