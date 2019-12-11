package com.lu.PersonImpl;

import com.lu.Person;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 13:11
 */
public class Lilei implements Person {
    @Override
    public void doSomething() {
        System.out.println(Lilei.class.getName() + "做了些什么");
    }
}
