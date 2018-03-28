package com.spagoweb.www.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Find the View that shows the Main activity
        Button home = (Button) findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Home activity is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(HistoryActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        // Find the View that shows the Song Details activity
        Button song_details = (Button) findViewById(R.id.song_details);

        // Set a click listener on that View
        song_details.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Song Details activity is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongDetailsActivity}
                Intent song_detailsIntent = new Intent(HistoryActivity.this, SongDetailsActivity.class);

                // Start the new activity
                startActivity(song_detailsIntent);
            }
        });
    }
}