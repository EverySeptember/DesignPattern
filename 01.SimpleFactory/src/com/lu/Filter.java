package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 11:31
 */
public interface Filter<T> {

    boolean handleData(T t);
}
