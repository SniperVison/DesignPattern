package Singleton;

/**
 * Created by huangwenshen 2019/7/1 17:43
 * 饿汉形式（贪婪加载）
 * 在单例对象声明的时候就直接初始化对象，可以避免多线程问题，但是如果对象初始化比较复杂，会导致程序初始化缓慢。
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return singleton2;
    }
}
