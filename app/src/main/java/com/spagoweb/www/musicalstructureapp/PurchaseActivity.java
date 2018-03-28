package com.spagoweb.www.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        // Find the View that shows the Main activity
        Button home = (Button) findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Main activity is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity}
                Intent homeIntent = new Intent(PurchaseActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
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
                Intent historyIntent = new Intent(PurchaseActivity.this, HistoryActivity.class);

                // Start the new activity
                startActivity(historyIntent);
            }
        });
    }
}