package com.example.demoRest.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/")
    public Integer hello(@PathVariable Integer num1, @PathVariable Integer num2) {
        return num1+num2;
    }
}
