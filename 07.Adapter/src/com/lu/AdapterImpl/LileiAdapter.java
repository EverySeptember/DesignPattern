package com.lu.AdapterImpl;

import com.lu.Adapter;
import com.lu.Person;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 14:24
 */
public class LileiAdapter implements Adapter {
    Person person;

    public LileiAdapter(Person person) {
        this.person = person;
    }

    @Override
    public void doSomething() {
        System.out.println("适配器日志：");
        person.doSomething();
    }
}
