package com.dxc.learning.demoapp1.service;

import antlr.collections.List;

public class UserService {

    public User getUserById(Int id);
    public User getUserByEmail(String email);
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(int id);

    public List<User> getAllUsers();

    
}
