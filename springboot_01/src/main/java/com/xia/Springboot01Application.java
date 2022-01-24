package com.xia;

import com.xia.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.print.Book;

@SpringBootApplication
public class Springboot01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Springboot01Application.class, args);
        BookController bean = ctx.getBean(BookController.class);
        System.out.println("bean========>" + bean);
        bean.getStart();

    }

}
