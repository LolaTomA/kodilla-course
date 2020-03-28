package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks = new ArrayList<>();
    String task;

    public TaskList(List<String> tasks) {
        this.tasks = tasks;
    }

    public void addTask (){
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getTask() {
        return task;
    }
}
