package com.company.Participants;

public class Participant {

    private int stamina;
    private int maximumHeight;
    private String name;
public Participant(String name, int maximumHeight, int stamina){
    this.name=name;
    this.maximumHeight=maximumHeight;
    this.stamina=stamina;
}
    public int getMaximumHeight() {
        return maximumHeight;
    }

    public String getName() {
        return name;
    }

       public int getStamina() {
        return stamina;
    }

    public boolean isActive() {
        return active;
    }

    private boolean active=true;

    public void decreaseStamina(int distance){
        if (!active)return;
        if(this.stamina-distance<0){
            this.stamina=0;
            isLose();
        }else this.stamina-=distance;
        }
    public void isLose(){
        active=false;
        System.out.println(name+" is lose");
    }
    @Override
    public String toString() {
        return "Participant-" + "Name: " + name+
        ", Stamina's value: " + stamina +
                ", Maximum height:" + maximumHeight;
    }
}
