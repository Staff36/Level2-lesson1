package com.Lesson1.RunnerTeam.Participants;


import com.Lesson1.Trace.Stages.Barier;
import com.Lesson1.Trace.Stages.Trace;
import com.Lesson1.Trace.Stages.Treadmill;

public abstract class Runners implements Activity{
    protected int endurance;
    protected String name;
    protected int maximumHeight;

    public boolean isActivity() {
        return activity;
    }

    protected boolean activity=true;

public Runners(String name, int maximumHeight, int maximumDistance){
    this.name= this.getClass().getSimpleName()+" "+name;
    this.maximumHeight=maximumHeight;
    this.endurance=maximumDistance;
}
    public int getEndurance() {
        return endurance;
    }
    public String getName() {
        return name;
    }

    public int getMaximumHeight() {
    return maximumHeight;
    }
    @Override
    public void run(Treadmill treadmill){
    if (!activity) return;
    if (endurance>=treadmill.getDistance()&&activity){
            System.out.println("Runner "+ name+" is ran "+treadmill.getDistance()+" meters");
            decreaseEndurance(treadmill.getDistance());
        } else isLose();

    }
    @Override
    public void gotOver(Barier barrier){
        if (!activity) return;
        if (maximumHeight>=barrier.getHeight()&&activity){
            System.out.println("Runner "+ name+" got over barrier "+barrier.getHeight()+" meters high");
        }else isLose();
    }
    @Override
    public void dolt(Trace trace){
    if (trace instanceof Treadmill){
        run((Treadmill) trace);
    }else gotOver((Barier) trace);
    }
    private void isLose(){
        System.out.println("Runner "+ name+ " is lose");
        activity=false;
    }
    public void decreaseEndurance(int distance){
        this.endurance-=distance;
    }

    @Override
    public String toString() {
        return "Runner " +name+", "+
                "endurance=" + endurance +
                ", maximum height=" + maximumHeight;
    }

}

