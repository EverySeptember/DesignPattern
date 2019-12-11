package com.lu;

import com.lu.AdapterImpl.LileiAdapter;
import com.lu.PersonImpl.Lilei;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/11 11:08
 */
public class AdapterMain {
    public static void main(String[] args) {
        Lilei lilei = new Lilei();
        LileiAdapter lileiAdapter = new LileiAdapter(lilei);
        lileiAdapter.doSomething();
    }
}
