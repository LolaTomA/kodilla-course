package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World implements PeopleQuantity {
    private final List<Continent> world = new ArrayList<>();

    public void addContinent(Continent continent){
        world.add(continent);

    }
    @Override
    public BigDecimal getPeopleQuantity(){
        return world.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPopulation())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
