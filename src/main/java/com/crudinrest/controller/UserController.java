package com.crudinrest.controller;

import com.crudinrest.entity.User;
import com.crudinrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getById(id);
    }

    @PostMapping("/addUser")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/update/{id}")
    public User update(@PathVariable int id, @RequestBody User user){
        return userService.update(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }
}