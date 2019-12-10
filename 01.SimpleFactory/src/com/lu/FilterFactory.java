package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/10 11:32
 */
public class FilterFactory {

    public Filter createFilter(String type) {
        switch (type) {
            case "id":
                return new IdFilter();
            case "packageName":
                return new PackageNameFilter();
            default:
                return null;
        }
    }
}
