package com.task.dao;

import com.task.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

    List<Student> findByGenderAndNationality(String gender, String nationality);

    @Query(value = "SELECT * FROM student WHERE roll_number IN ( SELECT DISTINCT(s.student_roll_number) FROM student_languages s INNER JOIN languages l ON s.languages_id = l.id AND l.languages IN (:language))", nativeQuery = true)
    List<Student> filterByLanguage(@Param("language") String[] language);

    @Query(value = "SELECT * FROM student s WHERE DATE(s.dob) > '2015-01-01'", nativeQuery = true)
    List<Student> filterByBirthDate();

    @Query(value = "SELECT * FROM student s WHERE s.past_education_board = ?", nativeQuery = true)
    List<Student> findByPastSchool(@Param("board") String board);

    @Query("SELECT s FROM Student s WHERE s.parentHighestQualification IN ('Postgraduate', 'Doctorate')")
    List<Student> findByParentsHighestQualification();


    @Query(value = "SELECT s.* FROM student s JOIN house h ON s.house_id = h.id WHERE h.house = ? ORDER BY h.house, s.roll_number", nativeQuery = true)
    List<Student> groupByHouse(@Param("house") String house);

    @Query(value = "SELECT s.* FROM student s WHERE s.nationality = ? ORDER BY s.nationality", nativeQuery = true)
    List<Student> groupByNationality(@Param("nationality") String nationality);

}
