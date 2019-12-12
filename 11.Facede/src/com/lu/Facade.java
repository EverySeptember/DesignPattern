package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 20:43
 */
public class Facade {
    First first = new First();
    Second second = new Second();
    Third third = new Third();

    public void on() {
        first.on();
        second.on();
        third.on();
    }
}
