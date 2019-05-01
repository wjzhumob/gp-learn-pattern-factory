package com.gp.learn.pattern.simplefactory;

import com.gp.learn.pattern.EnglishBook;
import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:05
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        BookFactory bookFactory = new BookFactory();
        IBook book = bookFactory.create(EnglishBook.class);
        book.read();

    }
}
