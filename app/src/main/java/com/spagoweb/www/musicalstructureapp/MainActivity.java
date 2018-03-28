package com.spagoweb.www.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Search activity
        Button search = (Button) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Search activity is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the History activity
        Button history = (Button) findViewById(R.id.history);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the History activity is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HistoryActivity}
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);

                // Start the new activity
                startActivity(historyIntent);
            }
        });
    }
}