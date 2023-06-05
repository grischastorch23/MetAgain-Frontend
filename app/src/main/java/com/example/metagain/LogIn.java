package com.example.metagain;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    private Button buttonLogIn;
    private Button buttonRegister;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonLogIn = findViewById(R.id.buttonLogin);
        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomepage();
            }
        });
        buttonRegister = findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToRegister();
            }
        });
    }

    public void openHomepage() {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }

    public void openToRegister() {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}