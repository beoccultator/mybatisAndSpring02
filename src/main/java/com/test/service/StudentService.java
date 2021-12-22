package com.test.service;

import com.test.bean.Student;
import com.test.dao.StudentDao;

import java.util.List;

public interface StudentService {


    List<Student> selectAll();

    Student selectOne(Integer id);

    int insertOne(Student student);

    int deleteOne(Integer id);

    int updateOne(Student student);


}
