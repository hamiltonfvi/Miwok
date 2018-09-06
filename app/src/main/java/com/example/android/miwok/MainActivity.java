package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Get a handle to all user interface elements
        final TextView numbers = (TextView) findViewById(R.id.numbers);
        final TextView family = (TextView) findViewById(R.id.family);
        final TextView colors = (TextView) findViewById(R.id.colors);
        final TextView phrases = (TextView) findViewById(R.id.phrases);

        // Setup event handler Numbers
        numbers.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivity(i);
            }
        });

        // Setup event handler Family
        family.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), FamilyMembersActivity.class);
                startActivity(i);
            }
        });

        // Setup event handler Colors

        colors.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ColorsActivity.class);
                startActivity(i);
            }
        });

        // Setup event handler Phrases
        phrases.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                //Create a new intent to open PhrasesActivity.class
                Intent i = new Intent(getApplicationContext(), PhrasesActivity.class);

                //Start the new activity
                startActivity(i);
            }
        });
    }
}