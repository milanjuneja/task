package com.task.service;

import com.task.dao.StudentDao;
import com.task.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student saveStudent(Student student){
        return studentDao.save(student);
    }


}
