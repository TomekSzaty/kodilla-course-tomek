package com.kodilla.patterns2.facade.observer.homework;

public class Participant implements ObserverParticipants {

    private final String participantMentorName;
    private int updateCount;

     public Participant(String participantName) {
        this.participantMentorName = participantName;
    }

    @Override
    public void update(ParticipantTasks participantTasks) {
        System.out.println(participantMentorName + "new task has been added for You to check: " +
                participantTasks.getTasks() + " in: " + participantTasks.getModule() + " by " +
                participantTasks.getUserCourseName() + "\n" +
                " (total: " + participantTasks.getTasks().size() + " to check in: " +
                participantTasks.getModule());
        updateCount++;
    }

    public String getParticipantName() {
        return participantMentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
