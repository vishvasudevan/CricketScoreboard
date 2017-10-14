package com.example.android.cricketscoreboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    int wicketforTeamA=0;
    int wicketforTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixTeamA(View view){
        scoreTeamA=scoreTeamA+6;
        displayScoreTeamA(scoreTeamA,wicketforTeamA);
    }

    public void fourTeamA(View view) {
        scoreTeamA = scoreTeamA + 4;
        displayScoreTeamA(scoreTeamA,wicketforTeamA);
    }

    public void twoTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA,wicketforTeamA);
    }

    public void wicketTeamA(View view){
        wicketforTeamA=wicketforTeamA+1;
        displayScoreTeamA(scoreTeamA,wicketforTeamA);
    }

    public void sixTeamB(View view){
        scoreTeamB=scoreTeamB+6;
        displayScoreTeamB(scoreTeamB,wicketforTeamB);
    }

    public void fourTeamB(View view) {
        scoreTeamB = scoreTeamB + 4;
        displayScoreTeamB(scoreTeamB,wicketforTeamB);
    }

    public void twoTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB,wicketforTeamB);
    }

    public void wicketTeamB(View view){
        wicketforTeamB=wicketforTeamB+1;
        displayScoreTeamB(scoreTeamB,wicketforTeamB);
    }

    public void displayScoreTeamA(int number1, int number2) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText("" + number1 + "-" +number2);
    }

    public void displayScoreTeamB(int number1, int number2) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText("" + number1 + "-" +number2);
    }

    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        wicketforTeamA=0;
        wicketforTeamB=0;
        displayScoreTeamA(scoreTeamA,wicketforTeamA);
        displayScoreTeamB(scoreTeamB,wicketforTeamB);
    }
}

