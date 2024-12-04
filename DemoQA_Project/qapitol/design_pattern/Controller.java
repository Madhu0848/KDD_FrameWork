package com.qapitol.design_pattern;

public class Controller {

	public static void main(String[] args) {
		
//		SingleTonDesign design  = SingleTonDesign.getInstance();
//		SingleTonDesign design1  = SingleTonDesign.getInstance();
//		
//		if(design.equals(design1) ) {
//			System.out.println(" Objects are same");
//		}else {
//			System.out.println("Objects are diffrent");
//		}

		
		ProductFactory productFactory = new ProductFactory("Product3");
				Product product = productFactory.instanceFactory();
				product.make();
		
	}

}
