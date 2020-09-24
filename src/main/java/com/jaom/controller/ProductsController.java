package com.jaom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jaom.entity.ProductCategories;
import com.jaom.entity.Products;
import com.jaom.services.ProductCategoryService;
import com.jaom.services.ProductsService;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductsService productService;
	@Autowired
	private ProductCategoryService productsCatService;
	
	//create
	@RequestMapping(value = "/newproduct")
	public String newProduct(Model model) {
		Products product = new Products();
		model.addAttribute("product", product);
		
		List<ProductCategories> listProdCat = productsCatService.listAll();
		model.addAttribute("listProdCat", listProdCat);
		System.out.println(listProdCat);
		return "newproduct";
	}
	
	//read
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String viewHomePage(Model model) {
		List<Products> listProducts = productService.getAll();
		model.addAttribute("listProducts", listProducts);
		return "index";
	}
	
	//getById
	
	//update
	
	//delete
	
}
