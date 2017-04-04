package com.example.android.scorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private TextView totalScoreGamer1;
    private TextView totalScoreGamer2;
    private int scoreGamer1 = 0;
    private int scoreGamer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TextView textGame = (TextView) findViewById(R.id.text_game);
        TextView textViewGamer1 = (TextView) findViewById(R.id.gamer1);
        TextView textViewGamer2 = (TextView) findViewById(R.id.gamer2);
        totalScoreGamer1 = (TextView) findViewById(R.id.total_score_gamer1);
        totalScoreGamer1 = (TextView) findViewById(R.id.total_score_gamer1);
        totalScoreGamer2 = (TextView) findViewById(R.id.total_score_gamer2);
       /* setGamer1();
        setGamer2();
        setTextGame();*/
        textGame.setText(MainActivity.game);
        textViewGamer1.setText(MainActivity.gamer1);
        textViewGamer2.setText(MainActivity.gamer2);
    }
    public void addOnePointGamerOne(View v){
        scoreGamer1++;
        totalScoreGamer1.setText(scoreGamer1+"");
    }
    public void addOnePointGamerTwo(View v){
        scoreGamer2++;
        totalScoreGamer2.setText(scoreGamer2+"");
    }
    public void addTwoPointsGamerOne(View v){
        scoreGamer1 = scoreGamer1 + 2;
        totalScoreGamer1.setText(scoreGamer1+"");
    }
    public void addTwoPointsGamerTwo(View v){
        scoreGamer2 = scoreGamer2 + 2;
        totalScoreGamer2.setText(scoreGamer2+"");
    }
    public void addBonusGamerOne(View v){
        scoreGamer1 = scoreGamer1 + 3;
        totalScoreGamer1.setText(scoreGamer1+"");
    }
    public void addBonusGamerTwo(View v){
        scoreGamer2 = scoreGamer2 + 3;
        totalScoreGamer2.setText(scoreGamer2+"");
    }
    public void resetScore(View v){
        totalScoreGamer1.setText(0+"");
        totalScoreGamer2.setText(0+"");
        scoreGamer1 = 0;
        scoreGamer2 = 0;
    }
    public void startNewGame(View v){
        Intent intentMainActivity = new Intent(GameActivity.this,MainActivity.class);
        startActivity(intentMainActivity);
    }
    public void viewWinner(View v){
        if(scoreGamer1 > scoreGamer2)
            Toast.makeText(this,MainActivity.gamer1 + " won",Toast.LENGTH_SHORT).show();
            else
                if(scoreGamer1 < scoreGamer2)
                    Toast.makeText(this,MainActivity.gamer2 +" won",Toast.LENGTH_SHORT).show();
                    else
                        if(scoreGamer1 == scoreGamer2)
                            Toast.makeText(this," equality",Toast.LENGTH_SHORT).show();
    }
}
