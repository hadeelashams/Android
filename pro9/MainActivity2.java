package com.example.program9;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvWelcome = findViewById(R.id.tvWelcome);

        SharedPreferences sharedPref = getSharedPreferences("UserData", MODE_PRIVATE);
        String name = sharedPref.getString("name", "User");
        String email = sharedPref.getString("email", "No Email");

        tvWelcome.setText("Welcome " + name + "!\n email: " + email);
    }
}
