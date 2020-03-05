package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country implements PeopleQuantity {
    private final String country;
    private final BigDecimal population;

    public Country(final String country, final BigDecimal population) {
        this.country = country;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    @Override
    public BigDecimal getPeopleQuantity(){
        return population;
    }
    @Override
    public String toString() {
        return country + " population: " + population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return getCountry().equals(country1.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry());
    }
}
