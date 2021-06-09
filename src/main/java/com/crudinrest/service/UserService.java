package com.crudinrest.service;

import com.crudinrest.entity.User;
import com.crudinrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return (List<User>) userRepository.findAll();
    }

    public User getById(int id){
        return userRepository.getById(id);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public User update(int id, User user){
        return userRepository.save(user);
    }

    public void delete(int id){
        userRepository.deleteById(id);
    }
}