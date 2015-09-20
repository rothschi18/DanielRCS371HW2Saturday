package com.example.administrator.danielrcs371hw2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {


    public TeamRosterDatabase TeamData;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declarePlayers();
        TeamData = new TeamRosterDatabase(this);
        TeamData.viewTeams();

    }

    public void declarePlayers()
    {


        ImageView view1 = (ImageView)findViewById(R.mipmap.player1);
        PlayerStats player1 = new PlayerStats(0, 0, 0, "One", "One", view1, "TeamOne");

        ImageView view2 = (ImageView)findViewById(R.mipmap.player2);
        PlayerStats player2 = new PlayerStats(0, 0, 0, "two", "One", view2, "TeamOne");

        ImageView view3 = (ImageView)findViewById(R.mipmap.player3);
        PlayerStats player3 = new PlayerStats(0, 0, 0, "three", "One", view3, "TeamOne");

        ImageView view4 = (ImageView)findViewById(R.mipmap.player4);
        PlayerStats player4 = new PlayerStats(0, 0, 0, "four", "One", view4, "Team4");

        ImageView view5 = (ImageView)findViewById(R.mipmap.player5);
        PlayerStats player5 = new PlayerStats(0, 0, 0, "five", "One", view5, "Team5");

        ImageView view6 = (ImageView)findViewById(R.mipmap.player6);
        PlayerStats player6 = new PlayerStats(0, 0, 0, "six", "One", view6, "Team6");

        ImageView view7 = (ImageView)findViewById(R.mipmap.player7);
        PlayerStats player7 = new PlayerStats(0, 0, 0, "seven", "One", view7, "Team7");

        ImageView view8 = (ImageView)findViewById(R.mipmap.player8);
        PlayerStats player8 = new PlayerStats(0, 0, 0, "eight", "One", view8, "Team8");

        ImageView view9 = (ImageView)findViewById(R.mipmap.player9);
        PlayerStats player9 = new PlayerStats(0, 0, 0, "nine", "One", view9, "Team9");

        TeamRoster team1 = new TeamRoster("TeamOne", view1);
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.addPlayer(player3);

        TeamRoster team2 = new TeamRoster("TeamTwo", view2);
        team2.addPlayer(player4);
        team2.addPlayer(player5);
        team2.addPlayer(player6);

        TeamData.addTeam(team1);
        TeamData.addTeam(team2);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
