package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeCollection = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape shape = shapeCollection.get(n);
        return shape;
    }

    public boolean  showFigures(){
        for (Shape figure : shapeCollection){
            System.out.println(figure.getShapeName() + figure.getField());
        }
        return true;
    }
}
