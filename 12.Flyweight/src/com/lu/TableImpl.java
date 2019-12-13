package com.lu;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/13 10:45
 */
public class TableImpl extends Table {
    public TableImpl(String name) {
        super(name);
    }

    @Override
    public void getTable() {
        System.out.println(String.format("得到了一个名为%s的表", this.name));
    }
}
