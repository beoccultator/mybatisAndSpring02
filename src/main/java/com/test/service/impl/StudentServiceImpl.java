package com.test.service.impl;

import com.test.bean.Student;
import com.test.dao.StudentDao;
import com.test.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentServiceImpl implements StudentService {


    private StudentDao studentDao;


    @Override
    public List<Student> selectAll() {
        return null;
    }

    @Override
    public Student selectOne(Integer id) {
        return null;
    }

    @Override
    public int insertOne(Student student) {
        return 0;
    }

    @Override
    public int deleteOne(Integer id) {
        return 0;
    }

    @Override
    public int updateOne(Student student) {
        return 0;
    }
}
