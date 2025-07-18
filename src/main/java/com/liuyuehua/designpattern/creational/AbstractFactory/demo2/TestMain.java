package com.liuyuehua.designpattern.creational.AbstractFactory.demo2;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory.AbstractFactory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory.ElectronicFactory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.factory.PhoneFactory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Memory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Processor;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo2.item.Screen;

public class TestMain {
    public static void main(String[] args) {
//        test1();
        test2();

    }

    private static void test2() {
        ElectronicFactory electronicFactory = FactoryMaker.makeFactory(FactoryType.PHONE);
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.createFactory(electronicFactory);
        System.out.println(abstractFactory.getScreen().getDescription()+"\n"+abstractFactory.getMemory().getDescription()+"\n"+abstractFactory.getProcessor().getDescription());

        System.out.println("\n");
        ElectronicFactory computerFactory = FactoryMaker.makeFactory(FactoryType.COMPUTER);
        abstractFactory.createFactory(computerFactory);
        System.out.println(abstractFactory.getScreen().getDescription()+"\n"+abstractFactory.getMemory().getDescription()+"\n"+abstractFactory.getProcessor().getDescription());
    }

    private static void test1() {
        PhoneFactory phoneFactory = new PhoneFactory();
        Screen screen = phoneFactory.produceScreen();
        Memory memory = phoneFactory.produceMemory();
        Processor processor = phoneFactory.produceProcessor();
        System.out.println(screen.getDescription()+"\n"+memory.getDescription()+"\n"+processor.getDescription());
    }
}
