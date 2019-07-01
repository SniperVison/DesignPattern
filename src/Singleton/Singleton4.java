package Singleton;

/**
 * Created by huangwenshen 2019/7/1 17:49
 * 这里创建了一个内部静态类，通过内部类的机制使得单例对象可以延迟加载，同时内部类相当于是外部类的静态部分，所以可以通过jvm来保证其线程安全。这种形式比较推荐。
 */
public class Singleton4 {
    private static class SingletonHolder {
        private static Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton4;
    }
}
