package com.n2sohidemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import groceryapp.models.ShoppingList;

@RestController
//@ComponentScan(basePackages = {"groceryapp.controllers"})
public class ShoppingListController {

	
	private List<ShoppingList> shoppingLists = Arrays.asList(
			
			new ShoppingList("HEB"),
			new ShoppingList("Walmart")
			);
			
	
	@RequestMapping(method = RequestMethod.POST, value = "/shoppinglist")
	public ShoppingList addShoppingList(@RequestBody ShoppingList ShoppingList) {
		
		return ShoppingList;
		
	}
	
	
	@RequestMapping("/shoppinglist/{title}")
	public ShoppingList getShoppingList(@PathVariable String title) {
		return new ShoppingList(title);
	}
	
	// localhost:8080/
	@RequestMapping("/shoppinglists")
	public List<ShoppingList> getShoppingLists() {
//		
//		ShoppingList shoppingList = new ShoppingList();
//		
//		shoppingList.setTitle("Walmart");
		
		return shoppingLists;
	}
	
	
	
	@RequestMapping("/")
	public String hello(){
		
		return "Hello World";
		
	}
	
}
