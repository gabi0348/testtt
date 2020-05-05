package com.internshipProject.SkillsOverflowBackend.services;

import com.internshipProject.SkillsOverflowBackend.models.User;
import com.internshipProject.SkillsOverflowBackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> list() {
        List<User> all = userRepository.findAll();
        return all;
    }

    public  User addUser(User user) {
        userRepository.saveAndFlush(user);
        return user;
    }


}
