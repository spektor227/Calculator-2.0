package com.company;

public class Main {

    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.sub(264, 22));
        System.out.println(intsCalc.div(100, 25));
        System.out.println(intsCalc.pow(225, 10));
    }
}
