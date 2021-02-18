package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAddToDoList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String task = board.getToDoList().addTasks("New task to do!");
        //Then
        assertEquals("New task to do!", board.getToDoList().addTasks(task));
    }

    @Test
    void testTaskAddToProgressList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String task = board.getInProgressList().addTasks("Task in processing!");
        //Then
        assertEquals("Task in processing!", board.getInProgressList().addTasks(task));
    }

    @Test
    void testTaskAddToDoneList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        String task = board.getDoneList().addTasks("Task is done!");
        //Then
        assertEquals("Task is done!", board.getDoneList().addTasks(task));
    }
}
