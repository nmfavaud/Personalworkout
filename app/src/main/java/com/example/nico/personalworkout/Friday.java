package com.example.nico.personalworkout;

public class Friday {
    private String name; private String description; private int imageResourceId;
    //drinks is an array of Drinks
    public static final Friday[] fridays = {
            new Friday("Cardio", "2 sets of 15 minutes split 8/12", R.drawable.cardio)
    };

    //Each Drink has a name, description, and an image resource
    private Friday(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
