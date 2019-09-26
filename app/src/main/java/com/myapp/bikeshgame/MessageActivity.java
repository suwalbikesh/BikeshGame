package com.myapp.bikeshgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtmessage;
    private Button btnOk;
    int points;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        //binding
        txtmessage = findViewById(R.id.txtMessage);
        btnOk = findViewById(R.id.btnOk);

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

        btnOk.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnOk) {
            Intent in = new Intent(MessageActivity.this,MainActivity.class);
            startActivity(in);
        }

    }
}
