package com.example.nico.personalworkout;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MondayCategoryActivity extends AppCompatActivity implements WorkoutMondayListFragment.Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday_category);
    }

        @Override
        public void itemClicked(long id) {
            View fragmentContainer = findViewById(R.id.fragment_container);
            if (fragmentContainer != null) {
                WorkoutMondayFragment details = new WorkoutMondayFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                details.setWorkout(id);
                ft.replace(R.id.fragment_container, details);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
            }
            else {
                Intent intent = new Intent(this, MondayActivity.class);
                intent.putExtra(MondayActivity.EXTRA_MONDAYID, (int)id);
                startActivity(intent);
            }
        }

    }