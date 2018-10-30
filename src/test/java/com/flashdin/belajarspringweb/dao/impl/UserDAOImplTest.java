package com.flashdin.belajarspringweb.dao.impl;

import com.flashdin.belajarspringweb.dao.UserDAO;
import com.flashdin.belajarspringweb.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Base64;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOImplTest {

    @Autowired
    private UserDAO userDAO;
    private User param;


    @Before
    public void setUp() {

        param.setPassword("password");
        param.setUsername("username");
        param.setEmail("email");
        param.setProfileName("Profile Name");
    }

    @Test
    public void findByUsernameAndPassword() {
        User login = userDAO.findByUsernameAndPassword("username", "password");
        if (login != null) {
            System.out.println("Login success");
        } else {
            System.out.println("Login gagal");
        }
    }

    @Test
    public void save() {
        userDAO.save(param);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByUsername() {
    }
}
