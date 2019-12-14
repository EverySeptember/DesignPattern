package com.lu.servers;

import com.lu.Server;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/13 21:40
 */
public class RealServer implements Server {
    private String msg;

    @Override
    public void receiveMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String sendMsg() {
        return this.msg;
    }
}
