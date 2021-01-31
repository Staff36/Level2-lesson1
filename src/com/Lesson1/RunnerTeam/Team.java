package com.Lesson1.RunnerTeam;

import com.Lesson1.RunnerTeam.Participants.Cat;
import com.Lesson1.RunnerTeam.Participants.Human;
import com.Lesson1.RunnerTeam.Participants.Robot;
import com.Lesson1.RunnerTeam.Participants.Runners;
import com.Lesson1.Trace.Course;
import com.Lesson1.Trace.Stages.Trace;

public class Team {
    private Runners team[] = new Runners[4];

    public Runners[] getTeam() {
        return team;
    }
    private String teamName;
    public Team(){
        this.teamName= "Avengers";
        this.team[0]= new Cat("Murka",10,200);
        this.team[1]= new Robot("Bender",0,300);
        this.team[2]= new Human("Kolya", 3,100);
        this.team[3]= new Human("Petya" ,6,150);
    }



    public void showWinners(){
        System.out.println(teamName+" team winners:");
        int count=0;
        for (int i = 0; i < team.length; i++) {
            if (team[i].isActivity()){
            System.out.println(team[i].getName());
            count++;}
        }
        if (count==0) System.out.println("No have a winners");
        else System.out.println("Total winners: "+count+"\n");
    }
    public void showTeamMembers(){
        System.out.println("Team members "+teamName+":");
        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i].toString());
        }
        System.out.println();
    }

}
