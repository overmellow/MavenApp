package com.wv.mfaraji.mystruts.mavenapp.service;

import java.util.List;

import com.wv.mfaraji.mystruts.mavenapp.dao.UserDao;
import com.wv.mfaraji.mystruts.mavenapp.model.User;

public class UserService{
	//create an object of SingleObject
	private static UserService instance = new UserService();
	private List<User> users;
	private UserDao userDao;	
	
	private UserService() {
		this.userDao = UserDao.getInstance();
		this.users = this.userDao.getUsers();
	}
	
    //Get the only object available
    public static UserService getInstance(){
       return instance;
    }
	
	public List<User> getUsers(){
		return this.users;
	}
	
	public User getUser(int id) {
		return this.users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
	}
	
	public void addUser(User user) {
		this.userDao.addUser(user);
	}	
}
