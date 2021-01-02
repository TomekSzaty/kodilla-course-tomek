package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests")
    class Tests {
        @Test
        public void shouldAddFigure() {
            //Given
            List<Shape>shapeList = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector( shapeList );
                    shapeList.add(new Circle(23));
                    shapeList.add(new Triangle(12));

            //When
            shapeCollector.addFigure(new Square(12));
            int actualListSize = shapeCollector.getShapeList().size();

            //Then
            Assert.assertEquals(3, actualListSize);
        }

        @Test
        public void shouldRemoveFigure() {
            //Given
            List<Shape>shapeList = new ArrayList<>();
            Circle circle = new Circle(23);
            Triangle triangle = new Triangle(12);
            Square square = new Square(12);
            shapeList.add(circle);
            shapeList.add(triangle);
            shapeList.add(square);

            ShapeCollector shapeCollector = new ShapeCollector(shapeList );

            //When
            shapeCollector.removeFigure(square);
            int actualListSize = shapeCollector.getShapeList().size();
            //Then
            Assert.assertEquals(2, actualListSize);
        }

        @Test
        public void shouldGetFigure() {
            //Given
            Circle circle = new Circle(23);
            Triangle triangle = new Triangle(12);
            Square square = new Square(12);
            ShapeCollector shapeCollector = new ShapeCollector(Arrays.asList(
                    circle, triangle, square));

            //When
            Shape shape = shapeCollector.getFigure(1);

            //Then
            Assert.assertEquals(triangle, shape);
        }

        @Test
        public void shouldShowFigures() {
            //Given
            Circle circle = new Circle(23);
            Triangle triangle = new Triangle(12);
            Square square = new Square(12);
            List<Shape> shapesList = Arrays.asList(circle, triangle, square);
            ShapeCollector shapeCollector = new ShapeCollector(shapesList);

            //When
            shapeCollector.showFigures();

            //Then test pass
        }
    }
}
