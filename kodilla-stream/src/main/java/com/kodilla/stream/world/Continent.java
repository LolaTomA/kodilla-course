package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {
    private final String continent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country){
        countryList.add(country);

    }
    public String getContinent() {
        return continent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent1 = (Continent) o;
        return continent.equals(continent1.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continent);
    }
}
