package TemplateMethod;

/**
 * Created by huangwenshen 2019/5/7 22:42
 */
public abstract class Display {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();

    }
}
