package com.kodilla.testing.shape;

class Circle implements Shape {
    private double field;
    public Circle(double field) {
        this.field = field;
    }


    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return field;
    }
    public String toString() {
        return "Circle";
    }
}