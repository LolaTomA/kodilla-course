package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    Double baseA;
    Double heightH;

    public Triangle(Double baseA, Double heightH) {
        this.baseA = baseA;
        this.heightH = heightH;
    }

    @Override
    public String  getShapeName() {
        return "Triangle ";
    }

    @Override
    public Double getField() {
        Double trField;
        trField = 0.5* baseA* heightH;
        return trField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(baseA, triangle.baseA) &&
                Objects.equals(heightH, triangle.heightH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseA, heightH);
    }
}
