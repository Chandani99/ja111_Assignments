package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Product;
import com.masai.exceptions.InvalidURIException;
import com.masai.exceptions.NullValueException;
import com.masai.exceptions.ProductNotFound;

@RestController
public class MyController {

	
//	@GetMapping("/hello")
//	public ResponseEntity<String> sayHello() {
//		
//		
//		
//		
//		org.springframework.http.HttpHeaders hh=new org.springframework.http.HttpHeaders();
//		hh.add("jwt", "sjhsgfgueef");
//		hh.add("user", "user");
//		hh.add("hello", "abc");
//		ResponseEntity<String> re=new ResponseEntity<String>("Welcome",hh,HttpStatus.ACCEPTED);
//		return re;
//	}
//	
	
	
//	Getting all products=============
	
	@GetMapping("/products")
	public List<Product> getAllProductDetail(){
		
		return Arrays.asList(
				new Product(10,"Sadan", 2102000, "Tata", "Four wheeler", 5022, 687876),
				new Product(11,"Punch", 4000000, "Tata", "Four wheeler", 5022, 687876),
				new Product(12,"SUVs", 2000000, "Tata", "Four wheeler", 5022, 687876),
				new Product(13,"Safri", 1102000, "Tata", "Four wheeler", 5022, 687876));
	}
	
	
//	Getting product of any perticular id
	
	@GetMapping(value="/getproduct/{id}")
	public Product getSingleProductDetail1(@PathVariable("id") Integer id) {
		if(id==null) {
			throw new NullValueException("Null vlaue");
		}
		
		Product pro=new Product(id,"Sadan", 2102000, "Tata", "Four wheeler", 5022, 687876);
	    return pro;
	}
	
	
//	Creating new Product
	
	@PostMapping(value="/product")
	public String createProduct(@RequestBody Product pro ) {
		if(pro==null) {
			throw new NullValueException("There is no value");
		}
		
		return "Product added" +pro;
		
	}
	
//	Deleting Product 
	@DeleteMapping(value="/product")
	public String deleteProduct(@RequestBody Product pro ) {
		if(pro==null) {
			throw new ProductNotFound("Product doesnot found");
		}
		return "Product deleted" +pro;
	}
	

	
	
//	Updating Product of any id
	@PutMapping(value="product/{id}")
	public Product updateProduct(@RequestBody Product pro, @PathVariable("id") Integer id) {
		
		if(pro==null) {
			throw new InvalidURIException("Invalid uri");
		}
		pro.setPrice(pro.getPrice()+10000);
		pro.setId(id);
		return pro;
	}


}
