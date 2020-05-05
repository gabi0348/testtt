package com.internshipProject.SkillsOverflowBackend.coltrollers;


import com.internshipProject.SkillsOverflowBackend.models.User;
import com.internshipProject.SkillsOverflowBackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<User> all() {
        return userService.list();}


    @PostMapping("/add")
    @ResponseBody
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

}