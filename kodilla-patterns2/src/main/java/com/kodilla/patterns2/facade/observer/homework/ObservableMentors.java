package com.kodilla.patterns2.facade.observer.homework;

public interface ObservableMentors {
    void registerMentor(ObserverParticipants observerParticipants);
    void notifyMentor();
    void removeMentor(ObserverParticipants observerParticipants);
}
