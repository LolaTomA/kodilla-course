package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard(){
        return new Board(getTaskList(),getTaskList(), getTaskList());
    }

    @Bean
    @Scope("prototype")
    public TaskList getTaskList() {
       return new TaskList();
    }

//    @Bean(name = "taskList2")
//    @Scope("prototype")
//    public TaskList getTaskList2(){
//        task = "in progress";
//        taskList.addTask();
//        return new TaskList(taskList.getTasks());
//    }
//
//    @Bean(name = "taskList3")
//    @Scope("prototype")
//    public TaskList getTaskList3(){
//        task = "task done";
//        taskList.addTask();
//        return new TaskList(taskList.getTasks());
//    }

}
