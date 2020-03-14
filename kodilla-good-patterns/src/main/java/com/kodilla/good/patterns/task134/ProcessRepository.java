package com.kodilla.good.patterns.task134;

import java.util.HashMap;
import java.util.Map;

public class ProcessRepository {
    Producer producer;
    Process process;

    Map<Producer, Process> processRepository = new HashMap<>();

    public void createProcess(){
        processRepository.put(producer, process);
    }
    public Process getProcess(){
        return processRepository.get(producer);
    }
}
