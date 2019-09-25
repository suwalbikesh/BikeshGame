package com.myapp.bikeshgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity{
    private TextView txtmessage;
    int points;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //binding
        txtmessage = findViewById(R.id.txtMessage);

        Intent intent = getIntent();

        points  = intent.getIntExtra("points",points);

        if (points == 10){
            message = "You Wins";
            txtmessage.setText(message);
        }

        else if (points == -10){
            message = "You Lose";
            txtmessage.setText(message);
        }


    }
}
