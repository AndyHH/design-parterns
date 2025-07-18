package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.phone;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Processor;

public class PhoneProcessor implements Processor {
    static  final String DESCRIPTION = "PhoneProcessor";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
