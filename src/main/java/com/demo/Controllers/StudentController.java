package com.demo.Controllers;

import com.demo.Entity.Student;
import com.demo.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/Student")
public class StudentController {

    @Autowired
    private IStudentService service;

    @GetMapping()
    public List<Student> Get() {
        List<Student> students = service.selectByCondition();
        return students;
    }
}
