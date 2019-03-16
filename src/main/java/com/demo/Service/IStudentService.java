package com.demo.Service;

import com.demo.Entity.Student;

import java.util.List;

public interface IStudentService {
    int deleteByPrimaryKey(int uid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(int uid);

    List<Student> selectByCondition();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}

