package com.gp.learn.pattern.abstractFactory;

import com.gp.learn.pattern.ChineseBook;
import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:33
 */
public class ChineseBookFactory implements AbstractBookFactory{
    @Override
    public IBook createBook() {
        return new ChineseBook();
    }

    @Override
    public INote createNote() {
        return new ChineseNote();
    }

    @Override
    public IVideo createVideo() {
        return new  ChineseVideo();
    }
}
