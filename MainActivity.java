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
    public static String game = "Football";
    public static String gamer1 = "Player 1";
    public static String gamer2 = "Player 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextPlayer1 = (EditText) findViewById(R.id.edit_text_player1);
        editTextPlayer2 = (EditText) findViewById(R.id.edit_text_player2);
        editTextTeam1 = (EditText) findViewById(R.id.edit_text_team1);
        editTextTeam2 = (EditText) findViewById(R.id.edit_text_team2);
        editTextGame = (EditText) findViewById(R.id.edit_text_game);
        Button buttonStartCounter = (Button) findViewById(R.id.start_counter);
        buttonStartCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextPlayer1.getVisibility()==View.VISIBLE) {
                    gamer1 = editTextPlayer1.getText().toString();
                    gamer2 = editTextPlayer2.getText().toString();
                    game = editTextGame.getText().toString();
                }
                else
                    if(editTextTeam1.getVisibility() ==View.VISIBLE)
                    {
                        gamer1 = editTextTeam1.getText().toString();
                        gamer2 = editTextTeam2.getText().toString();
                        game = editTextGame.getText().toString();
                    }
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
