package com.zensar.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("product")
public class Product {

	@Id
	private int id;
	private String name;
	private int cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}

}
