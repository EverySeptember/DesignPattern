package com.lu;

import com.lu.servers.Proxy;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/13 21:37
 */
public class ProxyMain {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.receiveMsg("握手");
        System.out.println(proxy.sendMsg());
    }
}
