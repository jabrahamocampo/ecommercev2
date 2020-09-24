package com.jaom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jaom.entity.Products;
import com.jaom.repository.ProductsRepository;

@Service
@Transactional
public class ProductsService {
	
	@Autowired
	private ProductsRepository productsRepo;
	
	//ListAll()
	public List<Products> getAll(){
		return productsRepo.findAll();
	}
	
	//Save
	
	//getId
	
	//Delete
}
