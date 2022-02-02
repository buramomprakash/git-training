package com.dxc.demoapp1.service;
import java.util.List;
import java.util.Optional;

import com.dxc.demoapp1.model.User;
import com.dxc.demoapp1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


    
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User getUserByEmail(String email) {

        return null;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        User user = getUserById(id);
        userRepository.delete(user);

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
