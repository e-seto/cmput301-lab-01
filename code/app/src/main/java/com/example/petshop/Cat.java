package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {
    // constructors
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    // method
    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {

    }
}
