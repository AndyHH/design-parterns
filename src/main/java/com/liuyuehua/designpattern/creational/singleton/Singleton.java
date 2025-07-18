package com.liuyuehua.designpattern.creational.singleton;

public class Singleton {
    private Singleton(){}

    private static volatile Singleton instance;

    public static  Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a Singleton instance!");
    }
}
