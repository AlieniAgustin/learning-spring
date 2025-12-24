package com.learningspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("aboutme")
    public String showAboutMe(){
        return "aboutme";
    }
}
