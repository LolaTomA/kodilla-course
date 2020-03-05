package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World worldPopulation = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("80000000")));
        europe.addCountry(new Country("France", new BigDecimal("64000000")));
        worldPopulation.addContinent(europe);

        Continent america = new Continent("America");
        america.addCountry(new Country("USA", new BigDecimal("360000000")));
        america.addCountry(new Country("Canada", new BigDecimal("60000000")));
        america.addCountry(new Country("Mexico", new BigDecimal("400000000")));
        worldPopulation.addContinent(america);

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1100000000" )));
        asia.addCountry(new Country("India", new BigDecimal("1200000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("180000000")));
        worldPopulation.addContinent(asia);

        //When
         worldPopulation.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("3482000000");
        Assert.assertEquals(expectedPopulation, worldPopulation.getPeopleQuantity());
    }
}
