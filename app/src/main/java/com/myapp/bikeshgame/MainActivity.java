package com.myapp.bikeshgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnfirst, btnsecond;
    private TextView txtPoints;

    int randomNumber, randomNumber2, value1, value2, points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btnfirst = findViewById(R.id.btnfirst);
        btnsecond = findViewById(R.id.btnsecond);
        txtPoints = findViewById(R.id.txtPoints);

        btnfirst.setOnClickListener(this);
        btnsecond.setOnClickListener(this);

        Random random = new Random();
        randomNumber = random.nextInt(100);
        randomNumber2 = random.nextInt(100);

        btnfirst.setText(String.valueOf(randomNumber));
        btnsecond.setText(String.valueOf(randomNumber2));

        points = 0;

    }

    @Override
    public void onClick(View v) {
        Random newrandom = new Random();
        if (v.getId() == R.id.btnfirst) {
            value1 = Integer.parseInt(btnfirst.getText().toString());
            value2 = Integer.parseInt(btnsecond.getText().toString());
            if (value1 > value2) {
                points = points + 1;
            } else {
                points = points - 1;
            }

            txtPoints.setText(String.valueOf(points));
            randomNumber = newrandom.nextInt(100);
            randomNumber2 = newrandom.nextInt(100);

            btnfirst.setText(String.valueOf(randomNumber));
            btnsecond.setText(String.valueOf(randomNumber2));

        } else if (v.getId() == R.id.btnsecond) {
            value1 = Integer.parseInt(btnfirst.getText().toString());
            value2 = Integer.parseInt(btnsecond.getText().toString());
            if (value2 > value1) {
                points = points + 1;
            } else {
                points = points - 1;
            }

            txtPoints.setText(String.valueOf(points));
            randomNumber = newrandom.nextInt(100);
            randomNumber2 = newrandom.nextInt(100);

            btnfirst.setText(String.valueOf(randomNumber));
            btnsecond.setText(String.valueOf(randomNumber2));

        }
        if (points == 10 || points == -10){
            Intent intent = new Intent(MainActivity.this,MessageActivity.class);
            intent.putExtra("points",points);
            startActivity(intent);
        }
    }
}
