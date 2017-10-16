package com.example.nico.personalworkout;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TuesdayCategoryActivity extends AppCompatActivity implements WorkoutTuesdayListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday_category);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            WorkoutTuesdayFragment details = new WorkoutTuesdayFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWorkout(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, TuesdayActivity.class);
            intent.putExtra(TuesdayActivity.EXTRA_TUESDAYID, (int)id);
            startActivity(intent);
        }
    }

}