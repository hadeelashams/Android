package com.example.pro7;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView image1, image2;
    private boolean showFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.imageView);
        image2=findViewById(R.id.imageView3);
        Button btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(showFirst){
                image1.setVisibility(View.GONE);
                image2.setVisibility(View.VISIBLE);
            }
            else {
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.GONE);
            }
                showFirst = !showFirst;
            }

        });

    }
}