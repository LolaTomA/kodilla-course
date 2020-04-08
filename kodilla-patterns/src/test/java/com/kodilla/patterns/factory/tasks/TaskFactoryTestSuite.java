package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING );
        //Then
        Assert.assertEquals(false, shopping.isTaskExecuted());
        Assert.assertEquals("Monday", shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals("Tuesday", painting.getTaskName());
    }

    @Test
    public void testFactoryRectangle() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVE);
        driving.executeTask();
        //Then
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals("Monday morning", driving.getTaskName());
    }
}
