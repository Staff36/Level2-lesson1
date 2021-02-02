package com.company;

import com.company.Course.Course;
import com.company.Participants.Participant;
import com.company.Participants.Team;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
        Team team= new Team("Avegers",
            new Participant("Andy",29,300),
            new Participant("Alex",45,400),
            new Participant("Philipp",7,200),
            new Participant("Kolyan",70,1500)
            );
        Course course= new Course(7);
        course.doIt(team);
        team.showTeamInfo();
        team.showPassedMembers();

    }
}
