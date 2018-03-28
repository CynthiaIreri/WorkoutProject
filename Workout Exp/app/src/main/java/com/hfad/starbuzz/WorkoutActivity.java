package com.hfad.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class WorkoutActivity extends Activity {

    public static final String EXTRA_WORKOUTNO = "drinkNo";
    public static final String EXTRA_BODYPARTNO = "Body Part Nu";
    public String mystr = "https://www.google.com/";

    public void browser(View v)
    {
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse(mystr));
        startActivity(browserIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        //Get the workout from the intent
        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_WORKOUTNO);
        int bodyPartSel = (Integer) getIntent().getExtras().get(EXTRA_BODYPARTNO);
        if (bodyPartSel == 0)
        {
            Workout workout = Workout.Abs[drinkNo];
            //Populate the workout image
            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(workout.getImageResourceId());
            photo.setContentDescription(workout.getName());

            //Populate the workout name
            TextView name = (TextView) findViewById(R.id.name);
            name.setText(workout.getName());

            //Populate the workout description
            TextView description = (TextView) findViewById(R.id.description);
            description.setText(workout.getDescription());
            mystr = "https://www.youtube.com/watch?v=1919eTCoESo&t=6s";
        }
       else if (bodyPartSel == 1)
        {
            Workout workout = Workout.Shoulders[drinkNo];
            //Populate the workout image
            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(workout.getImageResourceId());
            photo.setContentDescription(workout.getName());

            //Populate the workout name
            TextView name = (TextView) findViewById(R.id.name);
            name.setText(workout.getName());

            //Populate the workout description
            TextView description = (TextView) findViewById(R.id.description);
            description.setText(workout.getDescription());
            mystr ="https://www.youtube.com/watch?v=x0f2sfsh7ns&t=4s";
        }
       else if (bodyPartSel == 2)
        {
            Workout workout = Workout.Chest[drinkNo];
            //Populate the workout image
            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(workout.getImageResourceId());
            photo.setContentDescription(workout.getName());

            //Populate the workout name
            TextView name = (TextView) findViewById(R.id.name);
            name.setText(workout.getName());

            //Populate the workout description
            TextView description = (TextView) findViewById(R.id.description);
            description.setText(workout.getDescription());
            mystr ="https://www.youtube.com/watch?v=T3NHYjGhAkk&t=2s";


        }
        else if (bodyPartSel == 3)
        {
            Workout workout = Workout.Legs[drinkNo];
            //Populate the workout image
            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(workout.getImageResourceId());
            photo.setContentDescription(workout.getName());

            //Populate the workout name
            TextView name = (TextView) findViewById(R.id.name);
            name.setText(workout.getName());

            //Populate the workout description
            TextView description = (TextView) findViewById(R.id.description);
            description.setText(workout.getDescription());
            mystr ="https://www.youtube.chowom/watch?v=Womx4TM6p3A&t=32s";

        }
        else if (bodyPartSel == 4)
        {
            Workout workout = Workout.FullBody[drinkNo];
            //Populate the workout image
            ImageView photo = (ImageView) findViewById(R.id.photo);
            photo.setImageResource(workout.getImageResourceId());
            photo.setContentDescription(workout.getName());

            //Populate the workout name
            TextView name = (TextView) findViewById(R.id.name);
            name.setText(workout.getName());

            //Populate the workout description
            TextView description = (TextView) findViewById(R.id.description);
            description.setText(workout.getDescription());
            mystr ="https://www.youtube.com/watch?v=695PN9xaEhs&t=2s";

        }


    }
}
