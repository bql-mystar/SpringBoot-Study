package com.xie;

import com.xie.dao.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02MybatisApplicationTests {

    @Autowired
    private AccountDao accountDao;

    @Test
    void contextLoads() {
        System.out.println(accountDao.getById(3));
    }

}
