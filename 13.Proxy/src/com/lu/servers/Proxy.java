package com.lu.servers;

import com.lu.Server;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/13 21:39
 */
public class Proxy implements Server {
    Server server;

    public Proxy() {
        this.server = new RealServer();
    }

    @Override
    public void receiveMsg(String msg) {
        msg = String.format("信息已加工；原信息：%s", msg);
        server.receiveMsg(msg);
    }

    @Override
    public String sendMsg() {
        return server.sendMsg();
    }
}
