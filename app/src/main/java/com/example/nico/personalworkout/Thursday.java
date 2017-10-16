package com.example.nico.personalworkout;

public class Thursday {
    private String name; private String description; private int imageResourceId;
    //drinks is an array of Drinks
    public static final Thursday[] thursdays = {
            new Thursday("Squat", "Four sets of 10 repetitions at 50 kg", R.drawable.squat),
            new Thursday("Leg press", "Four sets of 10 repetitions at 76,5 kg", R.drawable.leg_press),
            new Thursday("Leg curl", "Four sets of 10 repetitions at 40,5 kg", R.drawable.leg_curl),
            new Thursday("Leg extension", "Four sets of 10 repetitions at 40,5 kg", R.drawable.leg_extension)
    };

    //Each Drink has a name, description, and an image resource
    private Thursday(String name, String description, int imageResourceId) {
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
