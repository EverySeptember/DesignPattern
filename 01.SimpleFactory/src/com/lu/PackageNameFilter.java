package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 11:32
 */
public class PackageNameFilter implements Filter {
    @Override
    public boolean handleData(Object o) {
        System.out.println("包名");
        return false;
    }
}
