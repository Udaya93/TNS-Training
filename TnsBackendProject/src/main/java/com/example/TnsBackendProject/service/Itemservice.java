package com.example.TnsBackendProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TnsBackendProject.entity.Item;
import com.example.TnsBackendProject.repositary.Itemrepo;

@Service
public class Itemservice {
	
@Autowired
	public Itemrepo irepo; //service linked to repositary

//insert
public Item addItem(Item item) {
	
	return irepo.save(item);
}

//getting data from db
public List<Item>  getAllitem(){
	return irepo.findAll();
}

//getting specific item from db 
public Optional<Item> getItem(long i) {
	return irepo.findById(i);
}

//delete data from db  with specific item id
public void deleteItem(long i) {
	irepo.deleteById(i);
}

//delete entire data 
public void deleteAllItems() {
	irepo.deleteAll();
}

//update data
//public void updateItem(Long i,String newname) {
//	
//int c=irepo.updateNameById(i,newname);
//
//}

}
