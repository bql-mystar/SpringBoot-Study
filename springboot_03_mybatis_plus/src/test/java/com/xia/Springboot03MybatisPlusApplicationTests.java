package com.xia;

import com.xia.dao.AccountDao;
import com.xia.dao.DeptDao;
import com.xia.domain.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03MybatisPlusApplicationTests {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private DeptDao deptmentDao;

    @Test
    void contextLoads() {
        System.out.println(accountDao.selectById(5));
    }

    @Test
    void testLombok(){
        List<Dept> list = deptmentDao.selectList(null);
        for (Dept department : list) {
            System.out.println(department);
        }
    }

}
