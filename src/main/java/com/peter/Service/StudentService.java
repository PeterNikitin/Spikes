package com.peter.Service;


import com.peter.DAO.StudentDao;
import com.peter.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    //@Qualifier("DaoImplFake")
    @Qualifier("DaoImplOracle")
    private StudentDao StudentDaoImpl;

    public Collection<Student> getAllStudents () {
        return StudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id) {
        return StudentDaoImpl.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        StudentDaoImpl.deleteStudentById(id);
    }

    public void insertStudent(Student student) {
        //check for existing id
        StudentDaoImpl.insertStudent(student);
    }

    public void updateStudent(Student student) {
        //verify student exists
        StudentDaoImpl.updateStudent(student);
    }


}
