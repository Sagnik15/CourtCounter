package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA;
    int scoreTeamB;

    private void displayTeamAScore(int i){

        TextView teamAScore = (TextView) findViewById(R.id.team_A_score);
        teamAScore.setText("" + i);

    }

    private void displayTeamBScore(int i){

        TextView teamAScore = (TextView) findViewById(R.id.team_B_score);
        teamAScore.setText("" + i);

    }

    private int threePoints(int score){
        score = score + 3;
        return score;
    }

    private int twoPoints(int score){
        score = score + 2;
        return score;
    }

    private int freeThrow(int score){
        score = score + 1;
        return score;
    }

    public void resetClicked(View view){
         scoreTeamA = 0;
         scoreTeamB = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }

    public void threePointsTeamA(View view){

        int res = threePoints(scoreTeamA);
        scoreTeamA = res;
        displayTeamAScore(scoreTeamA);
    }

    public void twoPointsTeamA(View view){
        int res = twoPoints(scoreTeamA);
        scoreTeamA = res;
        displayTeamAScore(scoreTeamA);
    }

    public void freeThrowTeamA(View view){
        int res = freeThrow(scoreTeamA);
        scoreTeamA = res;
        displayTeamAScore(scoreTeamA);
    }



    public void threePointsTeamB(View view){
        int res = threePoints(scoreTeamB);
        scoreTeamB = res;
        displayTeamBScore(scoreTeamB);
    }

    public void twoPointsTeamB(View view){
        int res = twoPoints(scoreTeamB);
        scoreTeamB = res;
        displayTeamBScore(scoreTeamB);
    }

    public void freeThrowTeamB(View view){
        int res = freeThrow(scoreTeamB);
        scoreTeamB = res;
        displayTeamBScore(scoreTeamB);

    }
}

