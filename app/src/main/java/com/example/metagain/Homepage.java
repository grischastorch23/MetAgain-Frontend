package com.example.metagain;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Homepage extends AppCompatActivity {

    ImageButton alerts;
    ImageButton meetings;
    ImageButton profile;
    Button inRadius;

    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        alerts = findViewById(R.id.homeToAlerts);
        alerts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlerts();
            }
        });

        meetings = findViewById(R.id.homeToMeetings);
        meetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeetings();
            }
        });

        profile = findViewById(R.id.homeToProfile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserProfile();
            }
        });

        inRadius = findViewById(R.id.homeImRadius);
        inRadius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInRadius();
            }
        });
    }

    public void openAlerts() {
        Intent intent = new Intent(this, Alerts.class);
        startActivity(intent);
    }

    public void openMeetings() {
        Intent intent = new Intent(this, Meetings.class);
        startActivity(intent);
    }

    public void openUserProfile() {
        Intent intent = new Intent(this, UserProfile.class);
        startActivity(intent);
    }

    public void openInRadius() {
        Intent intent = new Intent(this, HomepageInRadius.class);
        startActivity(intent);
    }
}