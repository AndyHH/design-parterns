package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.computer.ComputerMemory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.computer.ComputerProcessor;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.computer.ComputerScreen;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Memory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Processor;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Screen;

public class ComputerFactory implements ElectronicFactory {
    /**
     * 生产屏幕
     *
     * @return
     */
    @Override
    public Screen produceScreen() {
        return new ComputerScreen();
    }

    /**
     * 生产内存条
     *
     * @return
     */
    @Override
    public Memory produceMemory() {
        return new ComputerMemory();
    }

    /**
     * 生产处理器
     *
     * @return
     */
    @Override
    public Processor produceProcessor() {
        return new ComputerProcessor();
    }
}
