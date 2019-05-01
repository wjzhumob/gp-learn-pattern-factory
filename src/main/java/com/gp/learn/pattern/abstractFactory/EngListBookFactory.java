package com.gp.learn.pattern.abstractFactory;

import com.gp.learn.pattern.EnglishBook;
import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:32
 */
public class EngListBookFactory implements AbstractBookFactory{
    @Override
    public IBook createBook() {
        return new EnglishBook();
    }

    @Override
    public INote createNote() {
        return new EngLishNote();
    }

    @Override
    public IVideo createVideo() {
        return new EngLishVideo();
    }
}
