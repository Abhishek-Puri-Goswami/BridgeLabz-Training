package com.day09.birdsanctuaryapp;

import java.util.ArrayList;

public abstract class Bird {
    private final int id;
    private final String name;
    private final String species;

    public Bird(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public abstract void eat();

    @Override
    public String toString() {
        ArrayList<String> abilities = new ArrayList<>();
        if (this instanceof Flyable) abilities.add("Can Fly");
        if (this instanceof Swimmable) abilities.add("Can Swimm");
        if (abilities.isEmpty()) abilities.add("None");

        return String.format("Id: %d | %s (%s) -> %s",
                id, name, species, abilities.toString());
    }
}