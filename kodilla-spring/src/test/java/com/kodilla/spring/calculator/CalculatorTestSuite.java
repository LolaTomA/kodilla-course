package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addB = calculator.add(16, 4);
        double subB = calculator.sub(4, 16);
        double mul = calculator.mul(4, 4);
        double div = calculator.div(16, 4);
        double divBy0 = calculator.div(16, 0);

        //Then
        Assert.assertEquals(20.0, addB, 0.001);
        Assert.assertEquals(12, subB, 0.001);
        Assert.assertEquals(16, mul, 0.001);
        Assert.assertEquals(4, div, 0.001);
        Assert.assertEquals(0, divBy0, 0.001);
    }
}
