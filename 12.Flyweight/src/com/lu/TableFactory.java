package com.lu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/13 11:01
 */
public class TableFactory {
    private Map<String, Table> tablePool = new HashMap<>();

    public Table getTable(String name) {
        Table table = tablePool.get(name);
        if (table == null) {
            TableImpl result = new TableImpl(name);
            tablePool.put(name, result);
        }
        return table;
    }

    public int getSize() {
        return tablePool.size();
    }
}
