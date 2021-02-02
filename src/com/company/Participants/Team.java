package com.company.Participants;

import java.util.Arrays;

public class Team {
    String teamName;

    public String getTeamName() {
        return teamName;
    }

    public Participant[] getParticipant() {
        return participant;
    }

    Participant[] participant;
    public Team(String teamName, Participant... participant){
        this.teamName= teamName;
        this.participant=participant;
    }
    public void showTeamInfo(){
        System.out.println("Team name: "+teamName);
        for (int i = 0; i < participant.length; i++) {
            System.out.println(participant[i].toString());
        }
        System.out.println();
    }
    public void showPassedMembers(){
        int count=0;
        System.out.println("Winners of "+teamName+":");
        for (int i = 0; i < participant.length; i++) {
            if (participant[i].isActive()){
                System.out.println(participant[i].toString());
            count++;}
        }
        System.out.println("Total winners: "+count);

    }

}
