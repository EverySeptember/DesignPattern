package com.lu.product;

import com.lu.Filter;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 13:21
 */
public class IdFilter extends Filter {
    @Override
    public boolean hadleData() {
        this.create("id");
        System.out.println(this.name);
        return false;
    }
}
