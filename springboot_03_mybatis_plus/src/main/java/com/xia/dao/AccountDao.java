package com.xia.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xia.domain.Account;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountDao extends BaseMapper<Account> {
}
