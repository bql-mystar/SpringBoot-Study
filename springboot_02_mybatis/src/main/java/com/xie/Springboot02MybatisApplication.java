package com.xie;

import com.xie.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot02MybatisApplication {

    @Autowired
    private AccountDao accountDao;

    public static void main(String[] args) {
        SpringApplication.run(Springboot02MybatisApplication.class, args);
    }

}
