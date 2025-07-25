package com.example.pro3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        {
            EditText fno = findViewById(R.id.num1);
            EditText sno = findViewById(R.id.num2);
            Button add = findViewById(R.id.addbtn);
            Button sub = findViewById(R.id.subbtn);
            Button div = findViewById(R.id.divbtn);
            Button mul = findViewById(R.id.mulbtn);
            TextView tv = findViewById(R.id.result);

            View.OnClickListener listener = new View.OnClickListener() {
                @Override

                public void onClick(View v) {
                    String fstr = fno.getText().toString();
                    String Sstr = sno.getText().toString();

                    if (fstr.isEmpty() || Sstr.isEmpty()) {
                        tv.setText("plz enter both number");
                        return;

                    }

                    double n1 = Double.parseDouble(fstr);
                    double n2 = Double.parseDouble(Sstr);
                    double result = 0.0;

                    int id = v.getId();

                    if (id == R.id.addbtn) {
                        result = n1 + n2;
                    } else if (id == R.id.subbtn) {
                        result = n1 - n2;
                    } else if (id == R.id.divbtn) {
                        if (n2 == 0) {
                            tv.setText("Can not divide by zero");
                            return;
                        }
                        result = n1 / n2;

                    } else if (id == R.id.mulbtn) {
                        result = n1 * n2;
                    }
                    tv.setText("Result = " + String.valueOf(result));

                }
            };
            add.setOnClickListener(listener);
            sub.setOnClickListener(listener);
            mul.setOnClickListener(listener);
            div.setOnClickListener(listener);

        }
    }

}