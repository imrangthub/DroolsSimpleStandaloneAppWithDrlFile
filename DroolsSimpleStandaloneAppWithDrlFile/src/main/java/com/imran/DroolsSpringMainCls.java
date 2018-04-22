package com.imran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imran.model.Product;
import com.imran.service.ProductServiceImpl;

public class DroolsSpringMainCls {

	public static void main(String args[]) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductServiceImpl productServiceImplObj = ((ProductServiceImpl) applicationContext.getBean("ProductServiceImpl"));

		Product product = new Product();
		
		product.setType("other");
		
		showDiscount(product);

		productServiceImplObj.CalculateDiscount(product);

		showDiscount(product);
		
	}
	
	
	
	
	

	private static void showDiscount(Product product) {
		System.out.println("The discount is " + product.getDiscount());
	}
}