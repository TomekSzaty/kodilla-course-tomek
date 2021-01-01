package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList ;

    public ShapeCollector(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public void showFigures() {
        for (Shape figures : shapeList) {
            System.out.println(figures);
        }
    }
    public List<Shape> getShapeList() {
        return shapeList;
    }

    @Override
    public String toString() {
        return "ShapeList=" + shapeList;
    }
}
