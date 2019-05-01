package com.gp.learn.pattern.abstractFactory;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:29
 */
public class EngLishNote implements INote{
    @Override
    public void record() {
        System.out.println("做英语笔记！");
    }
}
