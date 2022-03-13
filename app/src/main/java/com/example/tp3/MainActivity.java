package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button debutButton , finButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        debutButton = findViewById(R.id.debutButton);
        finButton = findViewById(R.id.finButton);
        textView = findViewById(R.id.textView);

        debutButton.setOnClickListener(this);
        finButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == debutButton.getId()){
            textView.setText("Bonjour");
        }
        else if (view.getId() == finButton.getId()){
            textView.setText("Au revoir");
        }
    }
}