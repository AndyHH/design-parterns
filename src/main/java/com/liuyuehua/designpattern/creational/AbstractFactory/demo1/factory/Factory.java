package com.liuyuehua.designpattern.creational.AbstractFactory.demo1.factory;

import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Link;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Page;
import com.liuyuehua.designpattern.creational.AbstractFactory.demo1.item.Tray;

public abstract class Factory {
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

    public static Factory getFactory(String classname)
    {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        }catch (ClassNotFoundException e){
            System.out.println("没有找到类：" + classname);
        }catch (Exception e){
            e.printStackTrace();
        }
        return factory;
    }
}
