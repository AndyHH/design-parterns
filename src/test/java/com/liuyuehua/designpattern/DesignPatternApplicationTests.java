package com.liuyuehua.designpattern;

import com.liuyuehua.designpattern.creational.singleton.Singleton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        instance.showMessage();
    }

}
