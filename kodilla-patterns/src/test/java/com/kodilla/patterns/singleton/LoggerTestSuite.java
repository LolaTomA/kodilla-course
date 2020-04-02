package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Given
        Logger.getInstance().log("This is last log. ");

        //When
        String checkLog = Logger.getInstance().getLastLog();
        System.out.println("Tested string: " + checkLog);

        //Then
        Assert.assertEquals("This is last log. ", checkLog);
    }
    @Test
    public void testGetLastLog2(){
        //Given
        Logger.getInstance().log("This is log 1. ");
        Logger.getInstance().log("This is log 2. ");
        Logger.getInstance().log("This is last log2. ");

        //When
        String checkLog = Logger.getInstance().getLastLog();
        System.out.println("Tested string: " + checkLog);

        //Then
        Assert.assertEquals("This is last log2. ", checkLog);
    }
}
