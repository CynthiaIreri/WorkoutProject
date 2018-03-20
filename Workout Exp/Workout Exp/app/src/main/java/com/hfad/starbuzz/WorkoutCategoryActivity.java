package com.hfad.starbuzz;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class WorkoutCategoryActivity extends ListActivity {

    public static final String EXTRA_BODYPARTNO = "Body Part Nu";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        int bodyPartSel = (Integer) getIntent().getExtras().get(EXTRA_BODYPARTNO);
        if(bodyPartSel == 0) {
            ArrayAdapter<Workout> listAdapter = new ArrayAdapter<Workout>(this, R.layout.activity_middle, R.id.textView, Workout.Abs);
            listDrinks.setAdapter(listAdapter);

        }
        if(bodyPartSel == 1) {
            ArrayAdapter<Workout> listAdapter = new ArrayAdapter<Workout>(this, R.layout.activity_middle, R.id.textView, Workout.Shoulders);
            listDrinks.setAdapter(listAdapter);
        }
        if(bodyPartSel == 2) {
            ArrayAdapter<Workout> listAdapter = new ArrayAdapter<Workout>(this, R.layout.activity_middle, R.id.textView, Workout.Chest);
            listDrinks.setAdapter(listAdapter);
        }
        if(bodyPartSel == 3) {
            ArrayAdapter<Workout> listAdapter = new ArrayAdapter<Workout>(this, R.layout.activity_middle, R.id.textView, Workout.Legs);
            listDrinks.setAdapter(listAdapter);
        }
        if(bodyPartSel == 4) {
            ArrayAdapter<Workout> listAdapter = new ArrayAdapter<Workout>(this, R.layout.activity_middle, R.id.textView, Workout.FullBody);
            listDrinks.setAdapter(listAdapter);
        }

    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent intent = new Intent(WorkoutCategoryActivity.this, WorkoutActivity.class);
        intent.putExtra(WorkoutActivity.EXTRA_WORKOUTNO, (int) id);
        int bodyPartSel = (Integer) getIntent().getExtras().get(EXTRA_BODYPARTNO);
        intent.putExtra(WorkoutActivity.EXTRA_BODYPARTNO, bodyPartSel);
        startActivity(intent);
    }
}
