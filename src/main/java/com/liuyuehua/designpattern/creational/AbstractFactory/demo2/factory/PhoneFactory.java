package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Memory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Processor;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Screen;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.phone.PhoneMemory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.phone.PhoneProcessor;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.phone.PhoneScreen;

public class PhoneFactory implements ElectronicFactory{
    /**
     * 生产屏幕
     *
     * @return
     */
    @Override
    public Screen produceScreen() {
        return new PhoneScreen();
    }

    /**
     * 生产内存条
     *
     * @return
     */
    @Override
    public Memory produceMemory() {
        return new PhoneMemory();
    }

    /**
     * 生产处理器
     *
     * @return
     */
    @Override
    public Processor produceProcessor() {
        return new PhoneProcessor();
    }
}
