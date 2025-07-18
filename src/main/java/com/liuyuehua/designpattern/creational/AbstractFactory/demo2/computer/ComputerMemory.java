package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.computer;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Memory;

public class ComputerMemory implements Memory {
    static final String DESCRIPTION = "电脑内存";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
