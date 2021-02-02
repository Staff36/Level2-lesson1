package com.company.Course;

import com.company.Participants.Participant;

public class RuningTrace extends Stage {
    int distance;
    public RuningTrace(int distance){
        this.distance=distance;
    }
    @Override
    protected void doIt(Participant participant) {
        participant.decreaseStamina(this.distance);
        if(!participant.isActive()) return;
        System.out.println(participant.getName()+" ran "+distance+" meters. Stamina reserve "+participant.getStamina());}

}
