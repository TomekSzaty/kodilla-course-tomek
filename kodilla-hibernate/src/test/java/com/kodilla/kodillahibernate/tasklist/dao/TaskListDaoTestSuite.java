package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.task.Task;
import com.kodilla.kodillahibernate.task.TaskFinancialDetails;
import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
public class TaskListDaoTestSuite {


    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "MYLIST";
    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,"To learn programming" );

        //When
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(name);
        assertEquals("MYLIST", name);

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Write some entities", 3);
        TaskFinancialDetails tfd  =  new TaskFinancialDetails(
                new BigDecimal(20),false
        );
        TaskFinancialDetails tfd2 =new TaskFinancialDetails(
                new BigDecimal(10), false
        );
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("ToDo Task ", LISTNAME);
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        taskListDao.deleteById(id);

    }

}
