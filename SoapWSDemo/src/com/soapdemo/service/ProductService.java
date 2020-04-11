package com.soapdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProductService {

	public List<String> getProductCategories()
	{
		List<String> catalog=new ArrayList<>();
		
		catalog.add("Books");
		catalog.add("Music");
		catalog.add("Movies");
		
		return catalog;
	}
	
	List<String> bookList=new ArrayList<>();
	List<String> musicList=new ArrayList<>();
	List<String> movieList=new ArrayList<>();
	
	public ProductService()
	{
		bookList.add("Inferno1");
		bookList.add("Inferno2");
		bookList.add("Inferno3");
		
		musicList.add("M1");
		musicList.add("M2");
		musicList.add("M3");
		
		movieList.add("Star Wars");
		movieList.add("Jame Bond");
		movieList.add("F&F");
	}
	
	public List<String> getProducts(String category)
	{
		switch(category.toLowerCase())
		{
		case "books": return bookList;
		case "music": return musicList;
		case "movies": return movieList;
		}
		return null;
	}
	/*Function<String,List<String>> f=(c)->{
		
		switch(c.toLowerCase())
		{
		case "books": return bookList;
		case "music": return musicList;
		case "movies": return movieList;
		}
		return null;
	};*/
	
	public boolean addProducts(String category,String product)
	{
		switch(category.toLowerCase())
		{
		case "books": bookList.add(product);
			break;
		case "music": musicList.add(product);
			break;
		case "movies": movieList.add(product);
			break;
		
		default: return false;
		}
		return true;
		
	}
}
