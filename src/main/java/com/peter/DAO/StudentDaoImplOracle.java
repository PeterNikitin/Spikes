package com.peter.DAO;

import com.peter.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("DaoImplOracle")
public class StudentDaoImplOracle implements StudentDao{

    //Connection connectionOracle;

    @Override
    public Collection<Student> getAllStudents() {
        //All other methods to be implemented
        return new ArrayList<Student>(){
            {
                add(new Student(10, "Oracle", "Databases"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public void insertStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }
}
