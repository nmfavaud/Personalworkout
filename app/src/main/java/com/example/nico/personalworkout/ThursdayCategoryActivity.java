package com.example.nico.personalworkout;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThursdayCategoryActivity extends AppCompatActivity implements WorkoutThursdayListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thursday_category);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            WorkoutThursdayFragment details = new WorkoutThursdayFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWorkout(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, ThursdayActivity.class);
            intent.putExtra(ThursdayActivity.EXTRA_THURSDAYID, (int)id);
            startActivity(intent);
        }
    }

}