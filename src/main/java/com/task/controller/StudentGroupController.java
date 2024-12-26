package com.task.controller;

import com.task.entity.Student;
import com.task.service.StudentGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class StudentGroupController {

    @Autowired
    private StudentGroupService service;


    @GetMapping("/{house}")
    public ResponseEntity<List<Student>> groupByHouse(@PathVariable String house){
        return new ResponseEntity<>(service.groupByHouse(house), HttpStatus.OK);
    }

    @GetMapping("/nationality/{nationality}")
    public ResponseEntity<List<Student>> groupByNationality(@PathVariable String nationality){
        return new ResponseEntity<>(service.groupByNationality(nationality), HttpStatus.OK);
    }
}
