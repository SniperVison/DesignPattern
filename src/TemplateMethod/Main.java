package TemplateMethod;

/**
 * Created by huangwenshen 2019/5/7 22:52
 * 无论在父类类型的变量中保存哪个子类的实例。程序都可以正常工作，这种原则称为里氏替换原则(LSP)，LSP并非仅限于模板方法模式，它是通用的继承原则
 */
public class Main {
    public static void main(String[] args) {
        Display d = new CharDisplay('H');
        Display d2 = new StringDisplay("Hello, world.");
        Display d3 = new StringDisplay("你好, 世界.");
        d.display();
        d2.display();
        d3.display();

    }
}
