package com.test.dao.impl;

import com.test.bean.Student;
import com.test.dao.StudentDao;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate){
        this.sessionTemplate = sessionTemplate;
    }


    @Override
    public List<Student> selectAll() {
        StudentDao studentDao = sessionTemplate.getMapper(StudentDao.class);
        return studentDao.selectAll();
    }

    @Override
    public Student selectOne(Integer id) {
        StudentDao studentDao = sessionTemplate.getMapper(StudentDao.class);
        return studentDao.selectOne(id);
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
