package TemplateMethod;

/**
 * Created by huangwenshen 2019/5/7 22:48
 */
public class CharDisplay extends Display {

    private char c;

    public CharDisplay(char c) {
        this.c = c;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(c);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
