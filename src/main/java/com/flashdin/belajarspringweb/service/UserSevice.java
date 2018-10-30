package com.flashdin.belajarspringweb.service;

import com.flashdin.belajarspringweb.entity.User;

import java.util.List;

public interface UserSevice extends BaseService<User> {

    List<User> findByUsername(User param);

    User findByUsernameAndPassword(String username, String password);

}
