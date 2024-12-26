package com.task.controller;

import com.task.entity.FilterRequest;
import com.task.entity.Student;
import com.task.service.StudentFilterService;
import com.task.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/filter")
public class StudentFilterController {
    @Autowired
    private StudentFilterService service;

    @GetMapping("/{gender}/{nationality}")
    public ResponseEntity<List<Student>> filterByGenderAndNationality(@PathVariable String gender, @PathVariable String nationality){
        return new ResponseEntity<>(service.filterByGenderAndNationality(gender, nationality), HttpStatus.OK);
    }
    @PostMapping("/languages")
    public ResponseEntity<List<Student>> filterByLanguages(@RequestBody FilterRequest filterRequest){
        return new ResponseEntity<>( service.filterByLanguages(filterRequest.getLanguages()), HttpStatus.OK);
    }



    @GetMapping("/birth-date")
    public ResponseEntity<List<Student>> filterByBirthDate(){
        return new ResponseEntity<>( service.filterByDob(),HttpStatus.OK);

    }

    @GetMapping("/past-school/{board}")
    public ResponseEntity<List<Student>> filterByPastSchool(@PathVariable String board){
        return new ResponseEntity<>(service.filterByPastSchool(board), HttpStatus.OK);
    }

    @GetMapping("/parents")
    public ResponseEntity<List<Student>> filterByParentsHighestQualification(){
        return new ResponseEntity<>(service.filterByParentsHighestQualification(), HttpStatus.OK);
    }
}
