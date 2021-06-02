package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.zensar.CombinedResult;
import com.zensar.Department;
import com.zensar.User;
import com.zensar.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private WebClient.Builder client;
	@Autowired
	private UserRepository repo;

	@Override
	public User save(User user) {
		return repo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return repo.findAll();
	}

	@Override
	public CombinedResult getUserById(int id) {
		CombinedResult result = new CombinedResult();
		User user = repo.findUserById(id);
		Department dept = client.build().get().uri("http://localhost:9002/dept/" + user.getDepartmentId()).retrieve()
				.bodyToMono(Department.class).block();
		result.setUser(user);
		result.setDepartrment(dept);
		return result;
	}
}
