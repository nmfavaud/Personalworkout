package com.example.nico.personalworkout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WorkoutWednesdayFragment extends Fragment {
    private long wednesdayId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            wednesdayId = savedInstanceState.getLong("wednesdayId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_wednesday, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.name);
            Wednesday wednesday = Wednesday.wednesdays[(int) wednesdayId];
            title.setText(wednesday.getName());
            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(wednesday.getDescription());
            ImageView photo = (ImageView) view.findViewById(R.id.photo);
            photo.setImageResource(wednesday.getImageResourceId());
            photo.setContentDescription(wednesday.getName());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("wednesdayId", wednesdayId);
    }

    public void setWorkout(long id) {
        this.wednesdayId = id;
    }
}