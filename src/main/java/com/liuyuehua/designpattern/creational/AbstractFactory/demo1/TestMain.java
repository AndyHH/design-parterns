package com.liuyuehua.designpattern.creational.AbstractFactory.demo1;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.factory.Factory;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Link;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Page;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Tray;

public class TestMain {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("com.liuyuehua.designpattern.creational.AbstractFactory.demo1.factory.ListFactory");
        Link people = factory.createLink("人民日报", "https://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "https://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "https://www.yahoo.co.jp/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Tray tray = factory.createTray("日报");
        tray.add(people);
        tray.add(gmw);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(us_yahoo);
        traySearch.add(jp_yahoo);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "liuyuehua");
        page.add(tray);
        page.add(traySearch);
        page.output();

    }
}
