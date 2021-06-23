package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class DemoService {

//	@Autowired
    private UserDataDao userDataDao;
 
	public DemoService(UserDataDao userDataDao) {
		this.userDataDao = userDataDao;
	}
    
    
    public List<UserData> getUser(){
    	
    	return userDataDao.findAll();
    }    
}
