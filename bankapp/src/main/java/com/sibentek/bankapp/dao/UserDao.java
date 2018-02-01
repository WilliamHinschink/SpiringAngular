package com.sibentek.bankapp.dao;

import com.sibentek.bankapp.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by william on 01/02/2018.
 */
public interface UserDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

    User findByEmail(String email);
}
