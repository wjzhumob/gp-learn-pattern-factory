package com.gp.learn.pattern.abstractFactory;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:34
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        EngListBookFactory engListBookFactory = new EngListBookFactory();
        engListBookFactory.createBook().read();
        engListBookFactory.createNote().record();
        engListBookFactory.createVideo().play();

        ChineseBookFactory chineseBookFactory = new ChineseBookFactory();
        chineseBookFactory.createBook().read();
        chineseBookFactory.createNote().record();
        chineseBookFactory.createVideo().play();
    }
}
