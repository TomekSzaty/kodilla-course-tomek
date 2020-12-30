package com.kodilla.testing.shape;

import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList;

    public ShapeCollector(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public Shape getShape() {
        return null;
    }

    public void addFigure(Shape shape) {

    }

    public boolean removeFigure(Shape shape) {
        return true;
    }

    public Shape getFigure(int n) {
        return null;
    }

    public void showFigures() {
        //drukowanie figur
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    @Override
    public String toString() {
        return "ShapeList=" + shapeList;
    }
}
