package com.test.dao;

import com.test.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentDao {


    List<Student> selectAll();

    Student selectOne(Integer id);

    int insertOne(Student student);

    int deleteOne(Integer id);

    int updateOne(Student student);


}
