package Adapter;

/**
 * Created by huangwenshen 2019/5/6 22:48
 * 对象适配器模式
 */
public class PrintBanner2 implements Print {
    private Banner banner;

    public PrintBanner2(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
