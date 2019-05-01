package com.gp.learn.pattern.simplefactory;

import com.gp.learn.pattern.IBook;

/**
 * @author wjzhu
 * @createDate 2019-05-01 16:53
 */
public class BookFactory {

    public IBook create(Class<? extends IBook> clazz) {

        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
