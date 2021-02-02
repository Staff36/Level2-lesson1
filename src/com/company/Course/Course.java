package com.company.Course;

import com.company.Participants.Team;

import javax.swing.text.TabExpander;

public class Course {
    public Stage[] getStages() {
        return stages;
    }

    private Stage[] stages;
    public Course(int numberOfStages){
        stages= new Stage[numberOfStages];
        for (int i = 0; i < numberOfStages; i++) {
            if (i%2==0) stages[i]= new RuningTrace((i+1)*20);
            else stages[i]= new Barrier((i+1)*2);
        }
    }
    public void doIt(Team team){
        for (int i = 0; i < stages.length; i++) {
            stages[i].doIt(team);
        }
    }
}
