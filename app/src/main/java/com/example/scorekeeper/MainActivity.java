package com.example.scorekeeper;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    public void displayforteamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.scoreAid);
        scoreview.setText(String.valueOf(score));
    }

    public void displayforteamB(int scoreh) {
        TextView scoreviewh = (TextView) findViewById(R.id.scoreBid);
        scoreviewh.setText(String.valueOf(scoreh));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void addthreeforteamA(View v) {
        scoreA = scoreA + 3;
        displayforteamA(scoreA);

    }

    public void addthreeforteamB(View v) {
        scoreB = scoreB + 3;
        displayforteamB(scoreB);

    }

    public void addtwoforteamB(View v) {
        scoreB = scoreB + 2;
        displayforteamB(scoreB);

    }

    public void addtwoforteamA(View v) {
        scoreA = scoreA + 2;
        displayforteamA(scoreA);

    }

    public void addfreeforteamB(View v) {
        scoreB = scoreB + 1;
        displayforteamB(scoreB);
    }


    public void addfreeforteamA(View v) {
        scoreA = scoreA + 1;
        displayforteamA(scoreA);
    }
    public void resetall(View v){
        scoreA = 0 ;
        scoreB = 0 ;
        displayforteamA(scoreA);
        displayforteamB(scoreB);
    }

}
