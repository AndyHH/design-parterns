package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.list;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /**
     * 制作html
     *
     * @return
     */
    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
