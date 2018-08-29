package com.yanhk.test;

import com.yanhk.pojo.Students;
import com.yanhk.service.StudentsService;
import com.yanhk.service.impl.StudentsServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    private StudentsService studentsService ;
    @Before
    public void inits(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       studentsService = (StudentsService) context.getBean("studentsServiceImpl");
    }
    @Test
    public void findStu(){
        int id = 1;
        Students students =  studentsService.selectStu(id);
        System.out.println(students.toString());
    }

    @Test
    public void insertStu(){
        Students students = new Students();
        students.setName("wangwu");
        students.setSex("男");
        students.setAge(29);
        studentsService.insertStu(students);

    }

    @Test
    public void deleteStu(){
        int id = 3;
        studentsService.deleteStu(id);
    }

    @Test
    public void updateStu(){
     int id = 4;
     String name = "wangxiaoxiao";
     String sex = "女";
     int age = 20;
     studentsService.updateStu(id,name,sex,age);
    }
}
