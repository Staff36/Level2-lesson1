package com.Lesson1;

import com.Lesson1.RunnerTeam.Team;
import com.Lesson1.Trace.Course;

public class Main {

    public static void main(String[] args) {

        Team team= new Team();
        team.showTeamMembers();
        Course course= new Course(5);

        //team.dolt(course);

        course.dolt(team);
        team.showTeamMembers();
        team.showWinners();

    }
}
