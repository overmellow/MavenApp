package com.wv.mfaraji.mystruts.mavenapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wv.mfaraji.mystruts.mavenapp.model.User;
import com.wv.mfaraji.mystruts.mavenapp.service.AuthService;

public class AuthAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private AuthService authService;
	private User anonymousUser;

	public AuthAction() {		
		this.authService = AuthService.getInstance();
		this.anonymousUser = new User();
	}
	
	public String doLogin() {
		User authenticatedUser = this.authService.checkLogin(this.anonymousUser);
		if(authenticatedUser == null) {
			return LOGIN;
		}		
		this.authService.setAuthenticated(authenticatedUser);
        return SUCCESS;
    }

	public User getAnonymousUser() {
		return anonymousUser;
	}

	public void setAnonymousUser(User anonymousUser) {
		this.anonymousUser = anonymousUser;
	}	

	public String doLogout() {
		this.authService.setUnauthenticated();
        return SUCCESS;
    }

}
