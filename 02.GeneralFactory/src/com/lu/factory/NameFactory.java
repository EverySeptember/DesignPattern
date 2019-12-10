package com.lu.factory;

import com.lu.AbstractFactory;
import com.lu.Filter;
import com.lu.product.NameFilter;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 13:38
 */
public class NameFactory extends AbstractFactory {
    @Override
    public Filter createFilter() {
        return new NameFilter();
    }
}
