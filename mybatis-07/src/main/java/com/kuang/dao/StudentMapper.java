package com.kuang.dao;

import com.kuang.pojo.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生信息，及老师的信息

    List<Student> getStudent();
    List<Student> getStudent2();


}
