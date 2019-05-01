package com.gp.learn.pattern.factorymethod;

import com.gp.learn.pattern.EnglishBook;
import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:17
 */
public class EnglishBookFactory implements IBookFactory{
    @Override
    public IBook create() {
        return new EnglishBook();
    }
}
