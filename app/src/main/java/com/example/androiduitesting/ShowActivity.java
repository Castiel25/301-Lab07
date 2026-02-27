package com.example.androiduitesting;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    public static final String EXTRA_CITY_NAME = "extra_city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView cityText = findViewById(R.id.text_city_name);

        Button backButton = findViewById(R.id.button_back);

        String cityName = getIntent().getStringExtra(EXTRA_CITY_NAME);

        if (cityName == null) {
            cityName = "";
        }
        cityText.setText(cityName);

// The following is adapted from prompt "how to do simple button back to main activity" on Chatgpt, OPENAI

        backButton.setOnClickListener(v -> {
            finish();
        });
    }

}
