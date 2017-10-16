package com.example.nico.personalworkout;

public class Tuesday {
    private String name; private String description; private int imageResourceId;
    //drinks is an array of Drinks
    public static final Tuesday[] tuesdays = {
            new Tuesday("Chin up", "Four sets of 10 repetitions", R.drawable.traction),
            new Tuesday("Close grip pulldown", "Four sets of 10 repetitions at 41 kg", R.drawable.close_grip_pulldown),
            new Tuesday("Bent over barbell row", "Four sets of 10 repetitions at 50 kg", R.drawable.bent_over_barbell_row),
            new Tuesday("Cable row", "Four sets of 10 repetitions at 47.5 kg", R.drawable.cablerow),
            new Tuesday("Lying triceps extension", "Four sets of 10 repetitions at 40 kg", R.drawable.lying_triceps_extension),
            new Tuesday("Triceps pushdown", "Four sets of 10 repetitions at 29.5 kg", R.drawable.triceps_pushdown),
            new Tuesday("Dumbbell triceps extension", "Four sets of 10 repetitions at 45 kg", R.drawable.dumbbell_triceps)
    };

    //Each Drink has a name, description, and an image resource
    private Tuesday(String name, String description, int imageResourceId) {
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
