package com.example.petshop;

import java.util.Date;

public class Bored extends Mood {
    public Bored() {

    }

    public Bored(Date date) {
        super(date);
    }

    @Override
    public String displayMood() {
        return "mood is bored";
    }
}
