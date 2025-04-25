package com.ironhack.labIntermediateJPA.controllers;

import com.ironhack.labIntermediateJPA.models.BillableTask;
import com.ironhack.labIntermediateJPA.models.Task;
import com.ironhack.labIntermediateJPA.repositories.TaskRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")

public class TaskController {
    @Autowired
    private TaskRespository taskRespository;

    // Entendiendo como crear clases desde la API REST
    @PostMapping("/create-billable")
    @ResponseStatus(HttpStatus.CREATED)
    public BillableTask createBillableTask(@RequestBody BillableTask billableTask) {
        return taskRespository.save(billableTask);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getAllTasks() {
        return taskRespository.findAll();
    }


}





