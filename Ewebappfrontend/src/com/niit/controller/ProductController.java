package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.backendmodel.product;
import com.niit.backendDAO.*;


@Controller
public class ProductController 
{
	@Autowired
	productDAO productDAO;
	
	@Autowired
	categoryDAO categoryDAO;
	
	
	
	
	
	@RequestMapping(value="update product",method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product")product product)
	{
		
		productDAO.update(product);
			
		return "product";
	}
	
	
	
	
	
}
