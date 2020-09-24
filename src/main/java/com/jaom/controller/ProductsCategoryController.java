package com.jaom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jaom.entity.ProductCategories;
import com.jaom.services.ProductCategoryService;

@Controller
public class ProductsCategoryController {
	
	@Autowired
	ProductCategoryService productsCatService;
	
	@RequestMapping(value = "/categories")
	public String productsCategories(Model model) {
		List<ProductCategories> listProdCat = productsCatService.listAll();
		model.addAttribute("listProdCat", listProdCat);
		return "categories";
	}

}
