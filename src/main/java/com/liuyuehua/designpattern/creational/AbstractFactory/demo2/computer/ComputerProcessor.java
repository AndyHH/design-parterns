package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.computer;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Processor;

public class ComputerProcessor implements Processor {
    static final String DESCRIPTION = "ComputerProcessor";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
