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
        ShapeCollector shapes = new ShapeCollector();
        Square square =new Square(3.0);
        //When
        shapes.addFigure(square);
        //Then
        Assert.assertEquals(1, shapes.shapeCollection.size());
        Assert.assertEquals(square, shapes.getFigure(0));
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
        Shape fig1 = figure.getFigure(0);
        Shape fig2 = figure.getFigure(1);
        Shape fig3 = figure.getFigure(2);
        //Then
        Assert.assertEquals(3,figure.shapeCollection.size());
        Assert.assertEquals(square, fig1);
        Assert.assertEquals(triangle, fig2);
        Assert.assertEquals(circle, fig3);
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
