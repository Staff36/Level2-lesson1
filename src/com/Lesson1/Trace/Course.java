package com.Lesson1.Trace;

import com.Lesson1.RunnerTeam.Participants.Runners;
import com.Lesson1.RunnerTeam.Team;
import com.Lesson1.Trace.Stages.Barier;
import com.Lesson1.Trace.Stages.Trace;
import com.Lesson1.Trace.Stages.Treadmill;

public class Course {
    int count;
    Trace cource[];

    public Trace[] getCource() {
        return cource;
    }

    public Course(int count){
        this.count=count;
        cource= new Trace[count];
        for (int i = 0; i < count; i++) {
            if (i%2==0) cource[i]= new Treadmill((i+1)*15);
            else cource[i]= new Barier((i+1)*1);
        }
    }
    public void dolt(Team team){
        Runners[] runners = team.getTeam();
        for (int i = 0; i < runners.length ; i++) {
            System.out.println("Participant "+runners[i].getName()+" goes to the start");
            for (int j = 0; j < cource.length; j++) {
                if (cource[j] instanceof Treadmill){
                    runners[i].run((Treadmill) cource[j]);
                }else runners[i].gotOver((Barier) cource[j]);

            }
            if (runners[i].isActivity()) System.out.println(runners[i].getName()+" is won!\n");
            else System.out.println(runners[i].getName()+" is lose!\n");

        }
    }


}
