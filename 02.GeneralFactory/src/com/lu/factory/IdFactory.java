package com.lu.factory;

import com.lu.AbstractFactory;
import com.lu.Filter;
import com.lu.product.IdFilter;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 13:34
 */
public class IdFactory extends AbstractFactory {
    @Override
    public Filter createFilter() {
        return new IdFilter();
    }
}
