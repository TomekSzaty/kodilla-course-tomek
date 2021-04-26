package com.kodilla.patterns2.obsever.homework;

import com.kodilla.patterns2.facade.observer.homework.ModuleOne;
import com.kodilla.patterns2.facade.observer.homework.ModuleTwo;
import com.kodilla.patterns2.facade.observer.homework.Participant;
import com.kodilla.patterns2.facade.observer.homework.ParticipantTasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParticipantTestSuite {

    @Test
    void testUpdateTasksToCheckByMentors() {
        //Given
        ParticipantTasks moduleOne = new ModuleOne();
        ParticipantTasks moduleTwo = new ModuleTwo();
        Participant mentor01 = new Participant("MentorOne ");
        Participant mentor02 = new Participant("MentorTwo ");
        moduleOne.registerMentor(mentor01);
        moduleTwo.registerMentor(mentor02);
        //When
        moduleOne.addTask("Task01");
        moduleOne.addTask("Task02");
        moduleTwo.addTask("Task01");
        moduleOne.addTask("Task03");
        moduleTwo.addTask("Task02");
        //Then
        assertEquals(3, mentor01.getUpdateCount());
        assertEquals(2, mentor02.getUpdateCount());
    }
}
