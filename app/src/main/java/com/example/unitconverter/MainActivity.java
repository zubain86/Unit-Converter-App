package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText edittext;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView2);
        edittext = findViewById(R.id.editTextNumberDecimal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!edittext.getText().toString().isEmpty()) {
                    String s = edittext.getText().toString();
                    double p = Double.parseDouble(s);
                    double out = p * 1000;
                    textview.setText("Your answer in metres is" + " " + out);
                    Toast.makeText(MainActivity.this, "Thank You for using this app!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please enter the value!", Toast.LENGTH_SHORT).show();

                }
                    }

        });


    }
}