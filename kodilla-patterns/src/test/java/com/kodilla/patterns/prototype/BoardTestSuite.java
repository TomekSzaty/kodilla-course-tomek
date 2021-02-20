package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BoardTestSuite {

    @Test
    void testToString() {
        //Given
        TaskList listToDo = new TaskList("Tasks to do");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("Task to do- number: " + n)));

        TaskList listInProgress = new TaskList("Tasks in progress");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("Task in progress- number: " + n)));

        TaskList listDone = new TaskList("Tasks done");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Task done- number: " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);


        Board cloneBoard = null;
        try {
            cloneBoard = board.shallowCopy();
            cloneBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Board deepCloneBoard = null;
        try {
            deepCloneBoard = board.deepCopy();
            deepCloneBoard.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(cloneBoard);
        System.out.println(deepCloneBoard);
        assertEquals(2, board.getLists().size());
        assertEquals(2, cloneBoard.getLists().size());
        assertEquals(3, deepCloneBoard.getLists().size());
        assertEquals(cloneBoard.getLists(), board.getLists());
        assertNotEquals(deepCloneBoard.getLists(), board.getLists());
    }
}
