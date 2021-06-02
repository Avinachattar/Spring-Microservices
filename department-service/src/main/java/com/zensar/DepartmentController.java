package com.zensar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentRepository repo;

	@PostMapping("/dept")
	public Department save(@RequestBody Department dept) {
		return repo.save(dept);

	}

	@GetMapping("/dept")
	public List<Department> getAllDept() {
		return repo.findAll();

	}

	@GetMapping("/dept/{id}")
	public Department getProductById(@PathVariable("id") int departmentId) {
		if (repo.existsById(departmentId)) {
			Department product = repo.getById(departmentId);
			return product;
		} else {
			return new Department(0, "", "");
		}
	}
		
	}
