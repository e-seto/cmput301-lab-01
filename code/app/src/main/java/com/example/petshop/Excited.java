package com.example.petshop;

import java.util.Date;

public class Excited extends Mood {
    public Excited() {
    }

    public Excited(Date date) {
        super(date);
    }

    @Override
    public String displayMood() {
        return "mood is excited";
    }
}
