package com.peter.DAO;

import com.peter.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void insertStudent(Student student);

    void updateStudent(Student student);
}
