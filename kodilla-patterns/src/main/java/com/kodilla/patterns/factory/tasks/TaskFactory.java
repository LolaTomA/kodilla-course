package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "To buy";
    public static final String PAINTING = "To paint";
    public static final String DRIVE = "To drive";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Monday", "bred", 5.0);
            case PAINTING:
                return new PaintingTask("Tuesday", "red", "living room");
            case DRIVE:
                return new DrivingTask("Monday morning", "shopping centre", "car");
            default:
                return null;
        }
    }
}
