package com.gp.learn.pattern.abstractFactory;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:43
 */
public class ChineseNote implements INote {
    @Override
    public void record() {
        System.out.println("做语文笔记");
    }
}
