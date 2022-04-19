package com.kindergarten.service;

import com.kindergarten.model.User;

public interface UserService  {

	public User saveUser(User user);

	public User isUserPresent(String username, String password);

	public Boolean existsByEmailId(String emailId);

	public Boolean existsByUsername(String username);

}
