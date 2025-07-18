package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item;

import java.util.ArrayList;
import java.util.List;

/**
 * 折叠菜单
 */
public abstract class Tray extends Item {
    protected List<Item> tray;

    public Tray(String caption) {
        super(caption);
        this.tray = new ArrayList<>();
    }

    public void add(Item item) {
        tray.add(item);
    }
}
