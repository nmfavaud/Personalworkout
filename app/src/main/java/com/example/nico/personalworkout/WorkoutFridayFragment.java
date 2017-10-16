package com.example.nico.personalworkout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class WorkoutFridayFragment extends Fragment {
    private long fridayId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            fridayId = savedInstanceState.getLong("fridayId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_friday, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.name);
            Friday friday = Friday.fridays[(int) fridayId];
            title.setText(friday.getName());
            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(friday.getDescription());
            ImageView photo = (ImageView) view.findViewById(R.id.photo);
            photo.setImageResource(friday.getImageResourceId());
            photo.setContentDescription(friday.getName());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("fridayId", fridayId);
    }

    public void setWorkout(long id) {
        this.fridayId = id;
    }
}