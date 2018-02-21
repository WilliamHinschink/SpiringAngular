package com.sibentek.bankapp.service;

import com.sibentek.bankapp.domain.User;

import java.util.List;

/**
 * Created by william on 01/02/2018.
 */
public interface UserServiceIntf {

    User findByUsername(String username);

    User findByEmail(String email);

    Boolean checkUserExists(String username, String email);

    Boolean checkUsernameExists(String username);

    Boolean checkEmailExists(String email);

    void save(User user);

//    User createUser(User user, Set<UserRole> userRoles);

    User saveUser(User user);

    List<User> findUserList();

    void enableUser(String username);

    void disableUser(String username);
}
