package com.yanhk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentsController {
    @RequestMapping("/index")
    public String indexStu(){
        return "index";
    }
}
