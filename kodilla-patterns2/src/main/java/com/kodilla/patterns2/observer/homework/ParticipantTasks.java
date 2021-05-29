package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.homework.ObservableMentors;
import com.kodilla.patterns2.observer.homework.ObserverParticipants;

import java.util.ArrayList;
import java.util.List;

public class ParticipantTasks implements ObservableMentors {

    private final List<ObserverParticipants> observersMentors;
    private final List<String> tasks;
    private final String module;
    private final String userCourseName;

    public ParticipantTasks(String module, String userCourseName) {
        observersMentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.module = module;
        this.userCourseName = userCourseName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentor();
    }

    @Override
    public void registerMentor(ObserverParticipants observerParticipants) {
        observersMentors.add(observerParticipants);
    }

    @Override
    public void notifyMentor() {
        for (ObserverParticipants observerParticipants : observersMentors) {
            observerParticipants.update(this);
        }
    }

    @Override
    public void removeMentor(ObserverParticipants observerParticipants) {
        observersMentors.remove(observerParticipants);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getModule() {
        return module;
    }

    public String getUserCourseName() {
        return userCourseName;
    }
}
