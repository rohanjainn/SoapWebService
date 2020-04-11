package com.soapdemo;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soapdemo.service.ProductService;

@WebService
public class ProductCatalog {

	ProductService productService=new ProductService(); 
	@WebMethod
	public List<String> getProductCategories()
	{
		
		//System.setProperty("javax.xml.accessExternalDTD", "all");
		return productService.getProductCategories();
	}
	
	public List<String> getProducts(String category)
	{
		return productService.getProducts(category);
	}
	
	public boolean addProducts(String category,String product)
	{
		return productService.addProducts(category, product);
	}

}
