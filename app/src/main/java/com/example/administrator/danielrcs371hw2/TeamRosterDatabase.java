package com.example.administrator.danielrcs371hw2;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.HashMap;


/**
 * Created by rothschi18 on 9/19/2015.
 */
public class TeamRosterDatabase {
    private HashMap<String, TeamRoster> rosterDatabase;
    //I have set a limit on the total teams that can be made
    private int totalTeams;
    public Button[] teamList;
    private int maxTeams = 12;
    private Activity mainActivity;
    //pass in a view so methods in this function can manipulate it
    public TeamRosterDatabase(Activity Main)
    {
        mainActivity = Main;
        //totalTeams = countTeams();
        rosterDatabase = new HashMap<String, TeamRoster>();
        //Need to build up an array of all the buttons that will be the list of teams
        teamList = new Button[maxTeams];
        teamList[0] = (Button)mainActivity.findViewById(R.id.team1);
        teamList[1] = (Button)mainActivity.findViewById(R.id.team2);
        teamList[2] = (Button)mainActivity.findViewById(R.id.team3);
        teamList[3] = (Button)mainActivity.findViewById(R.id.team4);
        teamList[4] = (Button)mainActivity.findViewById(R.id.team5);
        teamList[5] = (Button)mainActivity.findViewById(R.id.team6);
        teamList[6] = (Button)mainActivity.findViewById(R.id.team7);
        teamList[7] = (Button)mainActivity.findViewById(R.id.team8);
        teamList[8] = (Button)mainActivity.findViewById(R.id.team9);
        teamList[9] = (Button)mainActivity.findViewById(R.id.team10);
        teamList[10] = (Button)mainActivity.findViewById(R.id.team11);
        teamList[11] = (Button)mainActivity.findViewById(R.id.team12);



    }

    public void addTeam(TeamRoster newTeam)
    {
        String key = newTeam.teamName;
        if(totalTeams>11)
            return;
        if(rosterDatabase.containsKey(key))
        {
            return;
        }

        rosterDatabase.put(key, newTeam);
    }

    public void deleteTeam(String key)
    {

        if(rosterDatabase.containsKey(key))
        {
            rosterDatabase.remove(key);
        }

    }


    public int countTeams()
    {
        return rosterDatabase.size();
    }
    //Displays the teams in the Main Activity
    public void viewTeams()
    {
        int counter = 0;

        for(String key: rosterDatabase.keySet())
        {
            teamList[counter].setText(rosterDatabase.get(key).teamName);

        }

    }
}
