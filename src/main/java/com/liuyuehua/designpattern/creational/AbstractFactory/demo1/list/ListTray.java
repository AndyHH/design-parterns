package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.list;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Item;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    /**
     * 制作html
     *
     * @return
     */
    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
