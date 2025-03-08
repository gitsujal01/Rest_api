package com.mycompany.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.entity.User;
import com.mycompany.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{ 
	@Autowired
    private UserRepository use;
	@Override
	public User createUSer(User u) {
		// TODO Auto-generated method stub
		return use.save(u);
	}
	@Override
	public List<User> showAll() {
		// TODO Auto-generated method stub
		return use.findAll();
	}
	@Override
	public Optional<User> getMe(Integer id) {
		// TODO Auto-generated method stub
		return use.findById(id);
	}
	@Override
	public User updateMe(Integer id, User u) {
		// TODO Auto-generated method stub
	    User userData = use.getById(id);
	    if(userData!= null)
	    {
	    	use.save(u);
	    }
		return null;
	}
	@Override
	public void deleteMe(Integer id) {
		// TODO Auto-generated method stub
		use.deleteById(id);
	}
	

}
