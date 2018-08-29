package com.yanhk.service.impl;

import com.yanhk.mapper.StudentsMapper;
import com.yanhk.pojo.Students;
import com.yanhk.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public void insertStu(Students students) {
        studentsMapper.addStu(students);
    }

    @Override
    public void deleteStu(int id) {
        studentsMapper.delStu(id);
    }

    @Override
    public void updateStu(int id,String name,String sex,int age) {
        Students students = new Students();
        students.setId(id);
        students.setName(name);
        students.setSex(sex);
        students.setAge(age);
        studentsMapper.updateStu(students);
    }

    @Override
    public Students selectStu(int id) {
        Students students=studentsMapper.findStu(id);
        return students;
    }
}
