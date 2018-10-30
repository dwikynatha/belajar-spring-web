package com.flashdin.belajarspringweb.dao;

import com.flashdin.belajarspringweb.entity.User;

import java.util.List;

public interface UserDAO extends BaseDAO<User> {

    List<User> findByUsername(User param);

    User findByUsernameAndPassword(String username, String password);

}
