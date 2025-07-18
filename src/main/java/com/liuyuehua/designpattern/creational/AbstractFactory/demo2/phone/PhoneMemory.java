package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.phone;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Memory;

public class PhoneMemory implements Memory {
    static final String DESCRIPTION = "手机内存";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
