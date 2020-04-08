package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.bigmacBuilder()
                .bun("standard")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("onion")
                .ingredient("mushrooms")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("standard", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("1000 islands", bigmac.getSauce());
    }
    @Test
    public void testBigmacNoAdditional() {
        //Given
        Bigmac bigmac = new Bigmac.bigmacBuilder()
                .bun("sesame")
                .burgers(0)
                .sauce("barbecue")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(0, howManyIngredients);
        Assert.assertEquals("sesame", bigmac.getBun());
        Assert.assertEquals(0, bigmac.getBurgers());
        Assert.assertEquals("barbecue", bigmac.getSauce());
    }
    @Test
    public void testBigmacWrongString() {
        //Given
        Bigmac bigmac = new Bigmac.bigmacBuilder()
                .bun("sesame")
                .burgers(0)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(0, howManyIngredients);
        Assert.assertEquals("sesame", bigmac.getBun());
        Assert.assertEquals(0, bigmac.getBurgers());
        Assert.assertEquals(null, bigmac.getSauce());
    }
}
