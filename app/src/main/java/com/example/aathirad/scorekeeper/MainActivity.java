package com.example.aathirad.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void a10(View v){
        scoreA = scoreA + 10;
        displayA(scoreA);
    }

    public void a50(View v){
        scoreA = scoreA + 50;
        displayA(scoreA);
    }

    public void a100(View v){
        scoreA = scoreA + 100;
        displayA(scoreA);
    }

    private void displayA(int score){
        TextView scoreView = (TextView) findViewById(R.id.A);
        scoreView.setText(""+score);
    }

    public void b10(View v){
        scoreB = scoreB + 10;
        displayB(scoreB);
    }

    public void b50(View v){
        scoreB = scoreB + 50;
        displayB(scoreB);
    }

    public void b100(View v){
        scoreB = scoreB + 100;
        displayB(scoreB);
    }

    private void displayB(int score){
        TextView scoreView = (TextView) findViewById(R.id.B);
        scoreView.setText(""+score);
    }

    public void reset(View v){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }




}
