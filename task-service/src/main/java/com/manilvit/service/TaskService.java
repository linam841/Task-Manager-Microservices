package com.manilvit.service;


import com.manilvit.entity.Task;
import com.manilvit.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private TaskRepository taskRepository;


    public TaskService (@Autowired TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }


    public Task save(Task task) {


        return taskRepository.save(task);

    }

    public Optional<Task> findById(long id) {
        return taskRepository.findById(id);
    }

    public void deleteById(long id) {
        taskRepository.deleteById(id);
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }


}
