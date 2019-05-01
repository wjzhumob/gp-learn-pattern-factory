package com.gp.learn.pattern.factorymethod;

import com.gp.learn.pattern.EnglishBook;
import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:19
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IBookFactory factory = new EnglishBookFactory();
        IBook book = factory.create();
        book.read();
    }
}
