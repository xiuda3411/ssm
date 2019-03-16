package com.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/RequestTest")
public class RequestTestController {

    @GetMapping()
    public String TestString(){
        return "This is a test string.Time:2019-3-10 22:17:00.";
    }
}
