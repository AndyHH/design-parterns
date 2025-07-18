package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.computer;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Screen;

public class ComputerScreen implements Screen {
    static final String DESCRIPTION = "电脑屏幕";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }


}
