package com.codecool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ShapeList {
    private List<Shape> shapeList = new ArrayList<>();

    public void add(Shape shape){
        shapeList.add(shape);
    }

    public Shape getLargest() {
        if (shapeList.size() > 0) {
            int maxArea = 0;
            Shape maxShape = null;
            for(Shape shape:shapeList){

                if (shape.getArea() > maxArea) {
                    maxArea = shape.getArea();
                    maxShape = shape;
                }
            }
            return maxShape;
        } else {
            return null;
        }
    }

    static String compareArea(Shape a, Shape b){
        if (a.getArea() == b.getArea()){

            return "Equal areas";
        } else {
            if (a.getArea() > b.getArea()){
                return a.speak();
            } else {

                return b.speak();
            }
        }
    }


}