package com.lu;

import com.lu.factory.IdFactory;
import com.lu.factory.NameFactory;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 13:10
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory idFactory = new IdFactory();
        AbstractFactory nameFactory = new NameFactory();

        Filter idFilter = idFactory.createFilter();
        Filter nameFilter = nameFactory.createFilter();

        idFilter.hadleData();
        nameFilter.hadleData();
    }
}
