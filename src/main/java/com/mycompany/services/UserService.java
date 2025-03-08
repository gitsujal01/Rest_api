package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import com.mycompany.entity.User;

public interface UserService {
        public User createUSer(User u);
        public List<User> showAll();
        public Optional<User> getMe(Integer id);
        public User updateMe(Integer id,User u);
        public void deleteMe(Integer id);
}
