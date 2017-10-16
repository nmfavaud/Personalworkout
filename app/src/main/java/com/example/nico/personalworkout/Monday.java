package com.example.nico.personalworkout;

public class Monday {
    private String name; private String description; private int imageResourceId;
    //drinks is an array of Drinks
    public static final Monday[] mondays = {
            new Monday("Incline press", "Four sets of 10 repetitions at 50 kg", R.drawable.dc_incline_haltere),
            new Monday("Bench press", "Four sets of 10 repetitions at 50 kg", R.drawable.dc),
            new Monday("Fly", "Four sets of 10 repetitions at 30 kg", R.drawable.fly),
            new Monday("Cable crossover", "Four sets of 10 repetitions at 18 kg", R.drawable.c_crossover),
            new Monday("Incline dumbbell curls", "Four sets of 10 repetitions at 25 kg", R.drawable.dumbbell_curl),
            new Monday("Larry scott", "Four sets of 10 repetitions at 22.5 kg", R.drawable.larry_scott),
            new Monday("Barbell curl", "Four sets of 10 repetitions at 40 kg", R.drawable.barbell_curl)
    };

    //Each Drink has a name, description, and an image resource
    private Monday(String name, String description, int imageResourceId) {
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

