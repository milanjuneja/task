package com.task.service;

import com.task.dao.StudentDao;
import com.task.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentGroupService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> groupByHouse(String house){
       return studentDao.groupByHouse(house);
    }
    public List<Student> groupByNationality(String nationality){
        return studentDao.groupByNationality(nationality);
    }

}
