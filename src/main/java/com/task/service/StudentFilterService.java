package com.task.service;

import com.task.dao.StudentDao;
import com.task.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentFilterService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> filterByGenderAndNationality(String gender, String nationality){
        return studentDao.findByGenderAndNationality(gender, nationality);
    }

    public List<Student> filterByLanguages(String[] languages){
       return studentDao.filterByLanguage(languages);
    }

    public List<Student> filterByDob(){
        return studentDao.filterByBirthDate();
    }
    public List<Student> filterByPastSchool(String board){
        return studentDao.findByPastSchool(board);
    }

    public List<Student> filterByParentsHighestQualification(){
        return studentDao.findByParentsHighestQualification();
    }
}
