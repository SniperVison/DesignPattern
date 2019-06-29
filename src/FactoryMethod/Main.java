package FactoryMethod;

/**
 * Created by huangwenshen 2019/6/29 11:55
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("C1");
        Product card2 = factory.create("C2");
        Product card3 = factory.create("C3");
        card1.use();
        card2.use();
        card3.use();
    }
}
