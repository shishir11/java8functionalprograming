/**
 * 
 */
package com.practise.jdk8.designpattern;

import java.util.Optional;

/**
 * @author shishir
 *
 */

/*
 * This interface represent the product specificaton
 */
interface Product {
	public String getProductDetails();
}
/*
 * This is a factory class use to instantiate the instance of the product.
 */
final class ProductFactory {
	final public Product getProduct(final String productName) {
		Product product = null;
		
		if(Optional.ofNullable(productName).get().equalsIgnoreCase("electronic"))
			product = () -> {
				return "This class represent electronic product";
			};
			else if(Optional.ofNullable(productName).get().equalsIgnoreCase("furniture")) {
				product = () -> {
					return "This class represent furniture product";
				};
			}
		return product;
	}
}

public class FactoryClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductFactory productFactory = new ProductFactory();
		Product product = productFactory.getProduct("electronic");
		System.out.println(product.getProductDetails());
		product = productFactory.getProduct("furniture");
		System.out.println(product.getProductDetails());

	}

}
