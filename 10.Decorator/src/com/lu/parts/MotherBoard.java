package com.lu.parts;

import com.lu.Computer;
import com.lu.Parts;

/**
 * @author tengfei.lu
 * @description
 * @date 2019/12/12 14:55
 */
public class MotherBoard extends Parts {
    private static final Double PRICE = 1200d;

    public MotherBoard(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String getDescription() {
        return String.format("%s;\n%s: %.2f", this.computer.getDescription(), "MotherBoard", PRICE);
    }

    @Override
    public double cost() {
        return this.computer.cost() + PRICE;
    }
}
