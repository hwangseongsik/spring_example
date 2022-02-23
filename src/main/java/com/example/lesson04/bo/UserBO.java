package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.UserDAO;

@Service
public class UserBO {

	@Autowired
	private UserDAO userDAO;
	
	public void addUserAsField(String name, String yyyymmdd, String introduce, String email) {
		userDAO.addUserAsField(name, yyyymmdd, introduce, email);
	}
}
