package com.lu.files;

import com.lu.File;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 11:35
 */
public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println();
        System.out.println(this.getName());
        for (File file : files) {
            file.display();
        }
    }

    public void add(File file) {
        this.files.add(file);
    }

    public void remove(File file) {
        this.files.remove(file);
    }
}
