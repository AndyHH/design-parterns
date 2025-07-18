package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.factory;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Link;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Page;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Tray;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.list.ListLink;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.list.ListPage;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.list.ListTray;

public class ListFactory extends Factory{
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray( caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
