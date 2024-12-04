package com.qapitol.design_pattern;

public class ProductFactory {
	
	private String name;
	
	public ProductFactory(String name){
		this.name = name;
	}
	
	
	public Product instanceFactory() {
		
		if(name.equalsIgnoreCase("Product1")) {
			return new Product1();
		}else if(name.equalsIgnoreCase("Product2")) {
			return new Product2();
		}else if(name.equalsIgnoreCase("Product3")) {
			return new Product3();
		}
		return null;
	}

}
