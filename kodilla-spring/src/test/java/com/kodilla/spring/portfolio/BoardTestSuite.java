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


        //When
        board.getDoneList().addTask("ate ");
        board.getDoneList().addTask("ate breakfast ");
        board.getDoneList().addTask("ate egs on breakfast");
        board.getInProgressList().addTask("bolek");
        board.getInProgressList().addTask("bolek lolek");
        board.getToDoList().addTask("car");



        //Then
        Assert.assertEquals(3, board.getDoneList().getTasks().size());
        Assert.assertEquals(2, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getToDoList().getTasks().size());

    }
}
