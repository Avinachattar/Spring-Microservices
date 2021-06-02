package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.model.Product;
import com.zensar.repository.ProductRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository repo;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Product> create(@RequestBody Product e) {
		Mono<Product> product = repo.save(e);
		return product;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Mono<Product> findById(@PathVariable("id") Integer id) {
		return repo.findById(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Flux<Product> findAll() {
		Flux<Product> product = repo.findAll();
		return product;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public Mono<Product> delete(@PathVariable("id") Integer id) {
		return repo.findById(id).flatMap(e -> repo.delete(e).then(Mono.just(e)));
	}

}
