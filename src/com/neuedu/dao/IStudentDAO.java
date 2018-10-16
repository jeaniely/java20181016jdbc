package com.neuedu.dao;

import com.neuedu.bean.Student;

import java.util.List;

public interface IStudentDAO {
    List<Student> getAll();
    Student getOne(String sno);
    int delete(String sno);
    int insert(Student student);
    int update(Student student);
}
