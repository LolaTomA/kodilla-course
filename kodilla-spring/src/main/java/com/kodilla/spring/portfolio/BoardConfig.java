package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    String task;
    @Autowired
    @Qualifier("taskList1")
    TaskList taskList;


    @Bean
    public Board getBoard(){
        return new Board(taskList, taskList, taskList);
    }

    @Bean(name = "taskList1")
    @Scope("prototype")
    public TaskList getTaskList1() {
        task = "to do";
        taskList.addTask();
        return new TaskList(taskList.getTasks());
    }

    @Bean(name = "taskList2")
    @Scope("prototype")
    public TaskList getTaskList2(){
        task = "in progress";
        taskList.addTask();
        return new TaskList(taskList.getTasks());
    }

    @Bean(name = "taskList3")
    @Scope("prototype")
    public TaskList getTaskList3(){
        task = "task done";
        taskList.addTask();
        return new TaskList(taskList.getTasks());
    }

}
