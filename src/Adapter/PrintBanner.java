package Adapter;

/**
 * Created by huangwenshen 2019/5/6 22:44
 * 类适配器模式
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        this.showWithAster();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
