package com.zensar.service;

import java.util.List;

import com.zensar.CombinedResult;
import com.zensar.User;

public interface UserService {

	public User save(User user);

	public List<User> getAllUser();

	public CombinedResult getUserById(int id);

}
