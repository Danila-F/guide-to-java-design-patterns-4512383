package com.example;

public class App {

    public static void main(String[] args) {
        var red = new Red();
        var blue = new Blue();

        var circle = new Circle(red);
        circle.getType();
        circle.getColor();

        var square = new Square(blue);
        square.getType();
        square.getColor();
    }

}
