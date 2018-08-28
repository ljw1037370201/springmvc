package com.yanhk.mapper;


import com.yanhk.pojo.Students;

public interface StudentsMapper {
    /**
     * 添加学生信息到数据库
     * @param students 学生信息
     */
    void addStu(Students students);

    /**
     * 根据id查询学生信息
     * @param id 学生的id
     * @return 学生的信息
     */
    Students findStu(int id);

    /**
     * 根据id删除学生信息
     * @param id 学生的id
     */
    void delStu(int id);

    /**
     * 根据id修改学生信息
     * @param id 学生id
     */
    void updateStu(int id);
}