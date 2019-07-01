package Singleton;

/**
 * Created by huangwenshen 2019/7/1 17:45
 * 双重检查加锁
 * 这个是懒汉形式的加强版，将synchronized关键字移到了newInstance方法里面，同时将singleton对象加上volatile关键字，这种方式既可以避免多线程问题，又不会降低程序的性能。但volatile关键字也有一些性能问题，不建议大量使用。
 */
public class Singleton3 {

    private volatile static Singleton3 singleton3;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
