package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.phone;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Screen;

public class PhoneScreen implements Screen {
    static final String DESCRIPTION = "Phone Screen";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
