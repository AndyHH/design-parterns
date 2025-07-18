package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.list;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Item;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><meta charset=\"UTF-8\"><title>").append(title).append("</title></head>\n");
        buffer.append("<body>");
        buffer.append("<h1>").append(title).append("</h1>");
        buffer.append("<ul>\n");
        for (Item item : content) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
