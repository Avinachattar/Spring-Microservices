package com.zensar.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.zensar.model.Product;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Integer> {
	}
