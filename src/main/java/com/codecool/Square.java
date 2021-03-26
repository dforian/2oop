package com.codecool;

public class Square extends Rectangle {
    public Square(int sideA) {
        super(sideA, sideA);
    }

    @Override
    public String speak() {

        return "I'm a square";
    }
}
