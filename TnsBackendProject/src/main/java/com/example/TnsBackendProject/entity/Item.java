package com.example.TnsBackendProject.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="item")
@Entity
public class Item {
	@Id
	public long id;
	public String name;
	public LocalDate manufacturing;
	public LocalDate expiry;
	public float price;
	public String category;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
	
	