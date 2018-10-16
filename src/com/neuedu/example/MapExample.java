package com.neuedu.example;

import com.neuedu.bean.Student;
import com.neuedu.dao.IStudentDAO;
import com.neuedu.dao.impl.StudentDAOImpl;
import com.neuedu.test.StudentTest;

import java.util.*;

public class MapExample {
    private static IStudentDAO studentDAO=new StudentDAOImpl();
    public static void main(String[] args) {
        Map<String,Student> map=new HashMap<>();
        List<Student> studentList=studentDAO.getAll();
        for(Student student:studentList) {
            map.put(student.getSno(), student);
        }


        Set<String> keys=map.keySet();//所有的key值
        for(String k:keys){
            //System.out.println(k);
            System.out.println(map.get(k));
        }

       // Hashtable
    }


}
