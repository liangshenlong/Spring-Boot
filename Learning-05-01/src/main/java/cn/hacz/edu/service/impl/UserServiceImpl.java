package cn.hacz.edu.service.impl;

import cn.hacz.edu.dao.UserDaoI;
import cn.hacz.edu.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceI {
    @Autowired
    private UserDaoI userDaoI;
}
