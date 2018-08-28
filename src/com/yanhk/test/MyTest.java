package com.yanhk.test;

import com.yanhk.pojo.Students;
import com.yanhk.service.StudentsService;
import com.yanhk.service.impl.StudentsServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
    private StudentsService studentsService = new StudentsServiceImpl();

    @Test
    public void findStu(){
        int id = 1;
        Students students = studentsService.selectStu(id);
        System.out.println(students.toString());
    }
}
