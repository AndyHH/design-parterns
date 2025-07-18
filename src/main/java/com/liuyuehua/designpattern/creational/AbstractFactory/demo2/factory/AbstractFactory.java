package com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Memory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Processor;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Screen;
import lombok.Getter;
import lombok.Setter;

/**
 * 封装单个工厂
 */
@Getter
@Setter
public class AbstractFactory {
    private Screen screen;
    private Memory memory;
    private Processor processor;

    public void createFactory(final ElectronicFactory factory) {
        setProcessor(factory.produceProcessor());
        setMemory(factory.produceMemory());
        setScreen(factory.produceScreen());

    }
}
