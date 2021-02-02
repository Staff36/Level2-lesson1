package com.company.Course;

import com.company.Participants.Participant;
import com.company.Participants.Team;

public abstract class Stage implements Trace{

    @Override
    public void doIt(Team team) {
        for (int i = 0; i < team.getParticipant().length; i++) {
            doIt(team.getParticipant()[i]);
        }
        System.out.println();

    }
    protected abstract void doIt(Participant participant);
}
