package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 11:29
 */
public class Main {

    public static void main(String[] args) {
        FilterFactory filterFactory = new FilterFactory();
        Filter id = filterFactory.createFilter("id");
        id.handleData(null);
        Filter packageName = filterFactory.createFilter("packageName");
        packageName.handleData(null);
    }
}
