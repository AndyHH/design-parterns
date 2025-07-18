package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item;

/**
 * 元素抽象类
 */
public abstract class Item {
    /**
     * 元素标题
     */
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    /**
     * 制作html
     * @return
     */
    public abstract String makeHTML();
}
