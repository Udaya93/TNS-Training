package com.example.TnsBackendProject.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TnsBackendProject.entity.Item;



public interface Itemrepo  extends JpaRepository<Item,Long>{

	 
	
	
}