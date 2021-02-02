package com.company.Course;

import com.company.Participants.Participant;

public class Barrier extends Stage {
    int height;

    public Barrier(int height){
        this.height=height;
    }
    @Override
    protected void doIt(Participant participant) {
        if (!participant.isActive()) return;
        if (height<participant.getMaximumHeight()) {
            participant.decreaseStamina(height*2);//при перелезании через препятствие все-таки силы тоже тратятся
            System.out.println(participant.getName() + " got over barrier with a height " + height + " meters. Stamina reserve " + participant.getStamina());
        } else participant.isLose();

    }
}
