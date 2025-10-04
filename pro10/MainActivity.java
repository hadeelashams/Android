package com.example.program10;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerColors;
    String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerColors = findViewById(R.id.spinnerColors);

        // Set up adapter for Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, colors);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerColors.setAdapter(adapter);

        // Event handling for spinner item selection
        spinnerColors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedColor = colors[position];
                Toast.makeText(MainActivity.this, "Selected: " + selectedColor, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Optional: Handle case when nothing is selected
            }
        });
    }
}
