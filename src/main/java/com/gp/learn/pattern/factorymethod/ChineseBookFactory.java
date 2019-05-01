package com.gp.learn.pattern.factorymethod;

import com.gp.learn.pattern.ChineseBook;
import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:18
 */
public class ChineseBookFactory implements IBookFactory{
    @Override
    public IBook create() {
        return new ChineseBook();
    }
}
