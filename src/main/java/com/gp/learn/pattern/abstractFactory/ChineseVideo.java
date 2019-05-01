package com.gp.learn.pattern.abstractFactory;

/**
 * @author wjzhu
 * @createDate 2019-05-01 17:44
 */
public class ChineseVideo implements IVideo {
    @Override
    public void play() {
        System.out.println("播放语文视频！");
    }
}
