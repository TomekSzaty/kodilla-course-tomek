package com.kodilla.testing.shape;

class Triangle implements Shape {
    private double field;
    public Triangle(double field) {
        this.field  = field;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return field;
    }
    public String toString() {
        return "Triangle";
    }
}