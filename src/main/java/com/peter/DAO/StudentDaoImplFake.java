package com.peter.DAO;

import com.peter.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("DaoImplFake")
public class StudentDaoImplFake implements StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Said", "Math"));
                put(2, new Student(2, "Sarah", "Finance"));
                put(3, new Student(3, "Alex", "Computing"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }

    @Override
    public void deleteStudentById(int id) {
        students.remove(id);
    }

    @Override
    public void insertStudent(Student student) {
        //check for existing id
        students.put(student.getId(), student);
    }

    @Override
    public void updateStudent(Student student) {
        //verify student exists
        students.put(student.getId(), student);
    }

}
