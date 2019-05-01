package com.gp.learn.pattern.abstractFactory;

import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:26
 */
public interface AbstractBookFactory {
    IBook createBook();
    INote createNote();
    IVideo createVideo();
}
