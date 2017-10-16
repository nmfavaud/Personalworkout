package com.example.nico.personalworkout;

public class Wednesday {
    private String name; private String description; private int imageResourceId;
    //drinks is an array of Drinks
    public static final Wednesday[] wednesdays = {
            new Wednesday("Dumbell press", "Four sets of 10 repetitions at 45 kg", R.drawable.dumbell_press),
            new Wednesday("Arnold press", "Four sets of 10 repetitions at 25 kg", R.drawable.arnold_press),
            new Wednesday("Front raise", "Four sets of 10 repetitions at 20 kg", R.drawable.front_raise),
            new Wednesday("Side raise", "Four sets of 10 repetitions at 10 kg", R.drawable.side_raise),
            new Wednesday("Bent over raise", "Four sets of 10 repetitions at 25 kg", R.drawable.bent_over_raise),
            new Wednesday("Upright row", "Four sets of 10 repetitions at 40 kg", R.drawable.upright_row)
    };

    //Each Drink has a name, description, and an image resource
    private Wednesday(String name, String description, int imageResourceId) {
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
