package com.golan.amit.boolpegia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WonActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAnotherGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_won);

        btnAnotherGame = findViewById(R.id.btnAnotherGame);
        btnAnotherGame.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnAnotherGame) {
            Intent i = new Intent(this, BoolPegiaActivity.class);
            startActivity(i);
        }
    }
}
