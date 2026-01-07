package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet {
    // constructors
    public Scorpion(String name) {
        super(name);
    }

    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    // method
    @Override
    public String speak() {
        return "hiss";
    }
}
