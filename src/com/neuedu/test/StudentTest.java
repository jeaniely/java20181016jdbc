package com.neuedu.test;

import com.neuedu.bean.Student;
import com.neuedu.dao.IStudentDAO;
import com.neuedu.dao.impl.StudentDAOImpl;

import java.util.List;

public class StudentTest {
    private static IStudentDAO studentDAO=new StudentDAOImpl();
    public static void main(String[] args) {
        getAll();
    }

    public static void getAll(){
        List<Student> students=studentDAO.getAll();
        for(Student student:students){
            System.out.println(student);
        }
    }
}
