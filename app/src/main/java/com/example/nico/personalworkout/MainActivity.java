package com.example.nico.personalworkout;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this, MondayCategoryActivity.class);
                            startActivity(intent);
                        }
                        if (position == 1) {
                            Intent intent = new Intent(MainActivity.this, TuesdayCategoryActivity.class);
                            startActivity(intent);
                        }
                        if (position == 2) {
                            Intent intent = new Intent(MainActivity.this, WednesdayCategoryActivity.class);
                            startActivity(intent);
                        }
                        if (position == 3) {
                            Intent intent = new Intent(MainActivity.this, ThursdayCategoryActivity.class);
                            startActivity(intent);
                        }
                        if (position == 4) {
                            Intent intent = new Intent(MainActivity.this, FridayCategoryActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}