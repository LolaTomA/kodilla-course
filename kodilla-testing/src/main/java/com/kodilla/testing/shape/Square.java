package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private Double sideA;

    public Square(Double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String  getShapeName(){
        return "Square ";
    }

    @Override
    public Double getField() {
        Double sqField;
        sqField = sideA* sideA;
        return sqField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(sideA, square.sideA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA);
    }

}
