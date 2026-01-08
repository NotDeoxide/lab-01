package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date moodDate;

    public Mood() {
        this.moodDate = new Date();
    }

    public Mood(Date moodDate) {
        this.moodDate = moodDate;
    }
    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }

    public abstract String mood();
}
