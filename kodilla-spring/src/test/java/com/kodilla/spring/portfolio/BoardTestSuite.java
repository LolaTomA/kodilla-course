package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        TaskList taskList1 = (TaskList)context.getBean("taskList1");
        TaskList taskList2 = (TaskList)context.getBean("taskList2");
        TaskList taskList3 = (TaskList)context.getBean("taskList3");

        //When
        board = new Board(taskList1, taskList2, taskList3);

        //Then
        Assert.assertEquals("to do", board.getToDoList().getTask());
        Assert.assertEquals("in progress", board.getInProgressList().getTask());
        Assert.assertEquals("task done", board.getDoneList().getTask());
    }
}
