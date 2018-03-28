package com.hfad.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class TopLevelActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                        if (position == 0) {
                            Intent intent = new Intent(TopLevelActivity.this, WorkoutCategoryActivity.class);
                            intent.putExtra(WorkoutCategoryActivity.EXTRA_BODYPARTNO, position);
                            startActivity(intent);
                        }
                       else if (position == 1) {
                            Intent intent = new Intent(TopLevelActivity.this, WorkoutCategoryActivity.class);
                            intent.putExtra(WorkoutCategoryActivity.EXTRA_BODYPARTNO, position);
                            startActivity(intent);
                        }
                        else if (position == 2) {
                            Intent intent = new Intent(TopLevelActivity.this, WorkoutCategoryActivity.class);
                            intent.putExtra(WorkoutCategoryActivity.EXTRA_BODYPARTNO, position);
                            startActivity(intent);
                        }
                        else if (position == 3) {
                            Intent intent = new Intent(TopLevelActivity.this, WorkoutCategoryActivity.class);
                            intent.putExtra(WorkoutCategoryActivity.EXTRA_BODYPARTNO, position);
                            startActivity(intent);
                        }
                        else if (position == 4) {
                            Intent intent = new Intent(TopLevelActivity.this, WorkoutCategoryActivity.class);
                            intent.putExtra(WorkoutCategoryActivity.EXTRA_BODYPARTNO, position);
                            startActivity(intent);
                        }
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
