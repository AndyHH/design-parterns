package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Memory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Processor;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Screen;

/**
 * 电子产品工厂
 */
public interface ElectronicFactory {
    /**
     * 生产屏幕
     * @return
     */
    Screen produceScreen();

    /**
     * 生产内存条
     * @return
     */
    Memory produceMemory();

    /**
     * 生产处理器
     * @return
     */
    Processor produceProcessor();
}
