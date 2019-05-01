package com.gp.learn.pattern.abstractFactory;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:29
 */
public class EngLishVideo implements IVideo {
    @Override
    public void play() {
        System.out.println("播放英语视频！");
    }
}
