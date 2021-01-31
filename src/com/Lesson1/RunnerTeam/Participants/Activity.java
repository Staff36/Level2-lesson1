package com.Lesson1.RunnerTeam.Participants;

import com.Lesson1.Trace.Stages.Barier;
import com.Lesson1.Trace.Stages.Trace;
import com.Lesson1.Trace.Stages.Treadmill;

public interface Activity {
     void gotOver(Barier barrier);
     void run(Treadmill treadmill);
     public void dolt(Trace trace);
}
