package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given

        int numbers[] = new int[5];
        numbers[0]= 5;
        numbers[1]= 10;
        numbers[2]= 5;
        numbers[3]= 10;
        numbers[4]= 20;

        //When
        getAverage(numbers);

        //Then
        Assert.assertEquals(10.0, getAverage(numbers), 0.001);
    }
}
