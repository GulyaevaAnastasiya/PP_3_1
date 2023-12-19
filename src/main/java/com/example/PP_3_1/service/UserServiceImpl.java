package com.example.PP_3_1.service;

import com.example.PP_3_1.dao.UserDao;
import com.example.PP_3_1.model.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public List<User> usersList() {
        return userDao.usersList();
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    @Transactional
    public User delete(int id) {
        userDao.delete(id);
        return null;
    }

    @Override
    public User get(int id) {
        return userDao.get(id);
    }
}
