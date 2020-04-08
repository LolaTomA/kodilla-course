package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;


    public static class bigmacBuilder {
        private  String bun;
        private  int burgers;
        private  String sauce;
        private  List<String> ingredients = new ArrayList<>();

        public bigmacBuilder bun(String bun) {
            if (bun.equals("standard") || bun.equals("sesame")) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("You can only choose standard or sesame bun!");
            }
        }

        public bigmacBuilder burgers(int burgers) {
            if (burgers <= 2 ) {
                this.burgers = burgers;
                return this;
            } else {
                throw new IllegalStateException("You can choose among 0 to 2 burgers!");
            }
        }

        public bigmacBuilder sauce(String sauce) {
            if (sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue") ||
            sauce.isEmpty()) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("You can only choose standard, 1000 islands, barbecue or no sauce!");
            }
        }

        public bigmacBuilder ingredient(String ingredient) {

            HashSet<String> weOfferIng = new HashSet<>();
            weOfferIng.add("salad");
            weOfferIng.add("onion");
            weOfferIng.add("bacon");
            weOfferIng.add("cucumber");
            weOfferIng.add("chili");
            weOfferIng.add("mushrooms");
            weOfferIng.add("prawns");
            weOfferIng.add("cheese");

            if (weOfferIng.contains(ingredient) || ingredient.isEmpty()) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException(" Sorry we don\'t offer such a choice." +
                        "Please, ask our stuff for ingredients list or choose none.");
            }
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac: \n" +
                "        bun:              " + bun + '\n' +
                "        burgers quantity: " + burgers + '\n'+
                "        sauce:            " + sauce + '\n' +
                "        ingredients      " + ingredients + " ";
    }
}
