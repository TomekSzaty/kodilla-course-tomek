package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        assertEquals("Groceries", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //Then
        assertEquals("Kitchen painting", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        assert driving != null;
        driving.executeTask();
        //Then
        assertEquals("Joyride", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }
}
