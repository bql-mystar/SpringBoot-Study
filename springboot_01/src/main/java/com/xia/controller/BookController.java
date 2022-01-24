package com.xia.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {

    @Value("${name}")
    private String name;

    @Value("${user.name}")
    private String username;

    @Value("${likes[1]}")
    private String myLike;

    @Value("${lovers[1].name}")
    private String loverName;

    @Value("${hobbies[0]}")
    private String hobby;

    @Value("${tempDir}")
    private String tempDir;

    @Value("${locDir}")
    private String locDir;

    @Autowired
    private Environment environment;


    @ResponseBody
    @RequestMapping
    public String getStart(){
        System.out.println("SpringBoot is running.....");
        System.out.println(name);
        System.out.println(username);
        System.out.println(myLike);
        System.out.println(loverName);
        System.out.println(hobby);
        System.out.println(tempDir);
        System.out.println(locDir);
        System.out.println("-------------------------------");
        System.out.println(environment.getProperty("hobbies[0]"));
        return "SpringBoot is running.....";
    }
}
