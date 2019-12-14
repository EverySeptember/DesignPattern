package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/14 11:09
 */
public abstract class Handler {

    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleData(Object object);
}
