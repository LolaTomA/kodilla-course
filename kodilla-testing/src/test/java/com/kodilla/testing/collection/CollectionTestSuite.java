package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test case: begin ");
    }
    @After
    public void after(){
        System.out.println("Test case: end ");
    }
    @Test
    public void testOddNumbersEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list. ");
        //Then
        Assert.assertEquals(0, OddNumbersExterminator.exterminate(emptyList).size());

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(0);
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        //When
        OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list. ");
        //Then
        Assert.assertEquals(1, OddNumbersExterminator.exterminate(normalList).size());
    }
}
