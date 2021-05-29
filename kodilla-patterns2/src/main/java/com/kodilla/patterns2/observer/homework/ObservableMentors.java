package com.kodilla.patterns2.observer.homework;

public interface ObservableMentors {
    void registerMentor(ObserverParticipants observerParticipants);

    void notifyMentor();

    void removeMentor(ObserverParticipants observerParticipants);
}
