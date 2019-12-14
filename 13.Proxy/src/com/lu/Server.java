package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/13 21:38
 */
public interface Server {
    void receiveMsg(String msg);

    String sendMsg();
}
