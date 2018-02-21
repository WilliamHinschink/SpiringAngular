package com.sibentek.bankapp.service.impl;

import com.sibentek.bankapp.dao.UserDao;
import com.sibentek.bankapp.domain.User;
import com.sibentek.bankapp.service.UserServiceIntf;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * Created by william on 01/02/2018.
 */
@Slf4j
@Service
@Transactional
public class UserServiceImpl implements UserServiceIntf {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public Boolean checkUserExists(String username, String email) {
        return checkUsernameExists(username) || checkEmailExists(email);
    }

    @Override
    public Boolean checkUsernameExists(String username) {
        return Objects.nonNull(this.findByUsername(username));
    }

    @Override
    public Boolean checkEmailExists(String email) {
        return Objects.nonNull(this.findByEmail(email));
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

//    @Override
//    public User createUser(User user, Set<UserRole> userRoles) {
//        return null;
//    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public List<User> findUserList() {
        return null;
    }

    @Override
    public void enableUser(String username) {

    }

    @Override
    public void disableUser(String username) {

    }
}
