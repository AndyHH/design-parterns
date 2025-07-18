package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的页面
 * @author Administrator
 *
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content;

    public Page(String title,String author){
        this.title = title;
        this.author = author;
        this.content = new ArrayList<>();
    }

    public void add(Item item){
        content.add(item);
    }

    public abstract String makeHTML();

    public void output(){
        String filename = title + ".html";
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filename), StandardCharsets.UTF_8);
            PrintWriter writer = new PrintWriter(osw);
            writer.println(this.makeHTML());
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
