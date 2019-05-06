package Adapter;

/**
 * Created by huangwenshen 2019/5/6 22:49
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeek();
        PrintBanner2 p2 = new PrintBanner2(new Banner("Hello"));
        p2.printStrong();
        p2.printWeek();
    }
}
