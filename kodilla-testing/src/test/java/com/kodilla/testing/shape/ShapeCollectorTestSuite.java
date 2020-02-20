package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test //czy doda figure do listy
    public void testAddFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        //When
        figure.addFigure(new Square(3.0));
        //Then
        Assert.assertEquals(1, figure.shapeCollection.size());
    }
    @Test//czy usuwa figure z listy
    public void testRemoveFigure() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        figure.addFigure(new Square(3.0));
        //When
        figure.removeFigure(new Square(3.0));
        //Then
        Assert.assertEquals(0, figure.shapeCollection.size());
    }
    @Test//czy zwroci false przy usuwaniu nie istniejacej figury
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Square square = new Square(3.0) ;
        //When
        boolean result = figure.removeFigure(square);
        //Then
        Assert.assertFalse(result);
    }
    @Test// wywolanie z listy n-tej figury
    public void testGetFigure(){
        //Given
        ShapeCollector figure = new ShapeCollector();
        Square square = new Square(3.0) ;
        Triangle triangle = new Triangle(8.0,4.0);
        Circle circle = new Circle(7.0);
        figure.addFigure(square);
        figure.addFigure(triangle);
        figure.addFigure(circle);
        //When
        figure.getFigure(0);
        figure.getFigure(1);
        figure.getFigure(2);
        //Then
        Assert.assertEquals(3,figure.shapeCollection.size());
        Assert.assertEquals(square, figure.getFigure(0));
        Assert.assertEquals(triangle, figure.getFigure(1));
        Assert.assertEquals(circle, figure.getFigure(2));
    }
    @Test// wydruk listy figur
    public void testShowFigures() {
        //Given
        ShapeCollector figure = new ShapeCollector();
        Square square = new Square(3.0);
        Triangle triangle = new Triangle(8.0, 4.0);
        Circle circle = new Circle(7.0);
        figure.addFigure(square);
        figure.addFigure(triangle);
        figure.addFigure(circle);
        //When
        boolean result = (figure.shapeCollection.size() == 3) && figure.showFigures();
        //Then
        Assert.assertTrue(result);
    }
}
