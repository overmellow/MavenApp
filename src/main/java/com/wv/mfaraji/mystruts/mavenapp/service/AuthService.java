package com.wv.mfaraji.mystruts.mavenapp.service;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.wv.mfaraji.mystruts.mavenapp.dao.UserDao;
import com.wv.mfaraji.mystruts.mavenapp.model.User;

public class AuthService {
	private static AuthService instance = new AuthService();
	private UserDao userDao;
	
	public AuthService() {
		this.userDao = UserDao.getInstance();
	}
	
    public static AuthService getInstance() {
       return instance;
    }    
	
	public User checkLogin(User user) {
		return this.userDao.getUserByUsernameAndPassword(user);		
	}
	
	public void setAuthenticated(User user) {		
		Map<String, Object> session = (Map<String, Object>) ActionContext.getContext().get("session");
		session.put("authenticatedUser", user);
	}

	public User checkAuthenticated() {
		Map<String, Object> session = (Map<String, Object>) ActionContext.getContext().get("session");
		return (User) session.get("authenticatedUser");
	}
	
	public void setUnauthenticated() {
		Map<String, Object> session = (Map<String, Object>) ActionContext.getContext().get("session");
		session.remove("authenticatedUser");
	}
}
