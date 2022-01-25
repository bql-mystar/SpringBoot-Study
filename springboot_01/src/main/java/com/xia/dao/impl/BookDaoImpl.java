package com.xia.dao.impl;

import com.xia.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("save is running......");
    }
}
