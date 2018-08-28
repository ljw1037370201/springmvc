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
    public void updateStu(int id) {
        studentsMapper.updateStu(id);
    }

    @Override
    public Students selectStu(int id) {
        Students students=studentsMapper.findStu(id);
        return students;
    }
}
