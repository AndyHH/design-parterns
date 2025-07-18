package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item;

/**
 * 链接
 */
public abstract class Link extends Item {
    /**
     * 链接地址
     */
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
