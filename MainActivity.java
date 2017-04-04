package com.example.android.scorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextPlayer1;
    private EditText editTextPlayer2;
    private EditText editTextTeam1;
    private EditText editTextTeam2;
    private EditText editTextGame;
    public static String game;
    public static String gamer1;
    public static String gamer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = "Football";
        gamer1 = "Player 1";
        gamer2 = "Player 2";
        editTextPlayer1 = (EditText) findViewById(R.id.edit_text_player1);
        editTextPlayer2 = (EditText) findViewById(R.id.edit_text_player2);
        editTextTeam1 = (EditText) findViewById(R.id.edit_text_team1);
        editTextTeam2 = (EditText) findViewById(R.id.edit_text_team2);
        editTextGame = (EditText) findViewById(R.id.edit_text_game);
        Button buttonStartCounter = (Button) findViewById(R.id.start_counter);
        buttonStartCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextTeam1.getVisibility() == View.VISIBLE && !editTextTeam1.getText().toString().equals(""))
                    gamer1 = editTextTeam1.getText().toString();
                    else if(editTextTeam1.getVisibility() == View.VISIBLE)
                        gamer1 = "Team 1";
                if(editTextTeam1.getVisibility() == View.VISIBLE && !editTextTeam2.getText().toString().equals(""))
                        gamer2 = editTextTeam2.getText().toString();
                else if(editTextTeam1.getVisibility() == View.VISIBLE)
                    gamer2 = "Team 2";
                if(editTextPlayer1.getVisibility() == View.VISIBLE && !editTextPlayer1.getText().toString().equals(""))
                    gamer1 = editTextPlayer1.getText().toString();
                else if(editTextPlayer1.getVisibility() == View.VISIBLE)
                    gamer1 = "Player 1";
                if(editTextPlayer2.getVisibility() == View.VISIBLE && !editTextPlayer2.getText().toString().equals(""))
                    gamer2 = editTextPlayer2.getText().toString();
                else if (editTextPlayer2.getVisibility() == View.VISIBLE )
                         gamer2 = "Player 2";
                if(!editTextGame.getText().toString().equals(""))
                    game = editTextGame.getText().toString();
                Intent intentGameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intentGameActivity);
            }
        });
    }
    public void setPlayer(View v){
        editTextPlayer1.setVisibility(View.VISIBLE);
        editTextPlayer2.setVisibility(View.VISIBLE);
        editTextTeam1.setVisibility(View.INVISIBLE);
        editTextTeam2.setVisibility(View.INVISIBLE);

    }
    public void setTeam(View v){
        editTextTeam1.setVisibility(View.VISIBLE);
        editTextTeam2.setVisibility(View.VISIBLE);
        editTextPlayer1.setVisibility(View.INVISIBLE);
        editTextPlayer2.setVisibility(View.INVISIBLE);
    }
}
