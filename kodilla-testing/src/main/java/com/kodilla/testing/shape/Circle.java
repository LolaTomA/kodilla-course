package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    Double diameterD;

    public Circle(Double diameterD) {
        this.diameterD = diameterD;
    }

    @Override
    public String  getShapeName() {
        return "Circle ";
    }

    @Override
    public Double getField() {
        Double ciField;
        ciField = 3.14 * ((diameterD* diameterD)/ 4);
        return ciField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(diameterD, circle.diameterD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameterD);
    }
}
