package com.mycompany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.User;
import com.mycompany.services.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService usee;
     @PostMapping("/user")
	 public User addUserDetails(@RequestBody User user)
     {
    	 return usee.createUSer(user);
     }
     @GetMapping("/user")
     public List<User> showAllll()
     {
    	 return usee.showAll();
     }
     @GetMapping("/user/{id}")
     public Optional<User> getById(@PathVariable Integer id)
     {
    	 return usee.getMe(id);
     }
     @PutMapping("/user/{id}")
     public User upD(@PathVariable Integer id,@RequestBody User uu)
     {
    	 return usee.updateMe(id, uu);
     }
     @DeleteMapping("/user/{id}")
     public void deleteMee(@PathVariable Integer id)
     {
    	 usee.deleteMe(id);
     }
}
