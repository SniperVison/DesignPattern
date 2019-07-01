package Singleton;

/**
 * Created by huangwenshen 2019/7/1 17:37
 * 懒汉形式(延迟加载)
 * 这个是标准的单例模式，通过newInstance里面的判断来进行延迟加载单例对象，这里加了synchronized关键字可以避免多线程问题，但会影响程序性能。
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
