package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public  void plusThree(View view){
        score+=3;
        displayForTeamA(score);
    }
    public  void plusTwo(View view)
    {
        score+=2;
        displayForTeamA(score);
    }
    public  void freeThrow(View view)
    {
        score+=1;
        displayForTeamA(score);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public  void plusThreeB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public  void plusTwoB(View view)
    {
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public  void freeThrowB(View view)
    {
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void displayForTeamB(int s) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(s));
    }

    //Reset scores
    public void reset(View view)
    {
        score=0;
        scoreB=0;
        displayForTeamA(score);
        displayForTeamB(scoreB);
    }
}