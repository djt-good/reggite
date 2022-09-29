package com.djt.service.impl;

import com.djt.domain.User;
import com.djt.mapper.UserMapper;
import com.djt.service.UserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service

public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User findByPhone(String phone) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("phone",phone);
        User user = userMapper.selectOneByExample(example);
        return user;
    }

    @Override
    public int add(User user) {
        int insert = userMapper.insert(user);
        return insert;
    }
}
