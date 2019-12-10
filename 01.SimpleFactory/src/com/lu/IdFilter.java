package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 11:31
 */
public class IdFilter implements Filter {
    @Override
    public boolean handleData(Object o) {
        System.out.println("ID");
        return false;
    }
}
