package com.myapp.bikeshgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button btnfirst, btnsecond;
    private TextView txtPoints;

    int randomNumber, randomNumber2;

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

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnfirst){
            

        }
        else if (v.getId() == R.id.btnsecond){

        }
    }
}
