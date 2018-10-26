package com.wv.mfaraji.mystruts.mavenapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.wv.mfaraji.mystruts.mavenapp.model.User;

public class UserDao {
	//create an object of SingleObject
	private static UserDao instance = new UserDao();
	private List<User> users;

    //make the constructor private so that this class cannot be
    //instantiated
    private UserDao(){
		this.users = new ArrayList<>();
		this.users.add(new User(1, "mori", "2000"));
		this.users.add(new User(2, "john", "2000"));
		this.users.add(new User(3, "jeff", "1000"));
    }

    //Get the only object available
    public static UserDao getInstance(){
       return instance;
    }	  
	
	public User getUser(int id) {
		return this.users.stream().filter(u -> u.getId() == id).findAny().orElse(null);
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}
	
	public List<User> getUsers() {
		return this.users;
	}
	
	public User getUserByUsernameAndPassword(User user) {
		return (User) this.users.stream().filter(u -> u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())).findAny().orElse(null);
	}
}
