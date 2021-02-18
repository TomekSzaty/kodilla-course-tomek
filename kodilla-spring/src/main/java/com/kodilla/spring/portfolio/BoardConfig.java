package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("listToDoList")
    TaskList listToDoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean(name = "board")
    public Board getBoard() {
        return new Board(listToDoList, inProgressList, doneList);
    }

    @Bean(name = "listToDoList")
    @Scope("singleton")
    public TaskList geToDoList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "inProgressList")
    @Scope("singleton")
    public TaskList getInProgressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "doneList")
    @Scope("singleton")
    public TaskList getDoneList() {
        return new TaskList(new ArrayList<>());
    }
}
