package com.example.TnsBackendProject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TnsBackendProject.entity.Item;
import com.example.TnsBackendProject.service.Itemservice;

//postman->controller->service->repo->db
@RestController
public class ItemController {
	
	@Autowired
	public  Itemservice iser;
	
	@PostMapping("/additem")
	public Item addItem(@RequestBody Item i) {
		return  iser.addItem(i);
	}
	@GetMapping("/getitem/{i}")
	public Optional<Item> getItem(@PathVariable long i){
		return iser.getItem(i);
	}
	
	@GetMapping("/getallitems")
	public java.util.List<Item> getAllItems() {
		return iser.getAllitem();
	}
	
	@DeleteMapping("/deleteitem/{i}")
	public void deleteItem(@PathVariable long i) {
		iser.deleteItem(i);
	}
	
	@DeleteMapping("/deleteitems")
	public void deleteAllItem() {
		iser.deleteAllItems();
	}
	

}
