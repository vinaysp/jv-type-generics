package org.example;


public class Main {
    public static void main(String[] args) {
        Box<Double, Double>   box = new Box("simpleBox");
        box.setLargestValue(4.5,5.7);
        System.out.println("Hello world!");
        Box<Double,Double> box1 = new Box("simpleBox");
        System.out.println(box1.hasSameName(box));
    }


}