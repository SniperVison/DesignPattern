package TemplateMethod;

/**
 * Created by huangwenshen 2019/5/7 22:49
 */
public class StringDisplay extends Display {

    private String s;
    private int width;

    public StringDisplay(String s) {
        this.s = s;
        this.width = s.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
