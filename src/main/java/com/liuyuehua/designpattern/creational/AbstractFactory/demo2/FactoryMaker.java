package com.liuyuehua.designpattern.creational.AbstractFactory.demo2;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory.ComputerFactory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory.ElectronicFactory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory.PhoneFactory;

public class FactoryMaker {
    private FactoryMaker(){}
    public static ElectronicFactory makeFactory(FactoryType type){
        return switch (type) {
            case PHONE -> new PhoneFactory();
            case COMPUTER -> new ComputerFactory();
        };
    }
}
