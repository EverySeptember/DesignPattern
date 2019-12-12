package com.lu.parts;

import com.lu.Computer;
import com.lu.Parts;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 14:55
 */
public class GPU extends Parts {
    private static final Double PRICE = 2800d;

    public GPU(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return String.format("%s;\n%s: %.2f", this.computer.getDescription(), "GPU", PRICE);
    }

    @Override
    public double cost() {
        return this.computer.cost() + PRICE;
    }
}
