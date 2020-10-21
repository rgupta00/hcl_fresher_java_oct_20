package com.day4.session1;
//String and enum are two different things!

enum ShirtSize{
	S(38),M(40),L(42),XL(44),XXL(46);
	private int size;
	private ShirtSize(int size) {
		this.size=size;
	}
	public int getSize() {
		return size;
	}
	
}

class Shirt{
	private String brand;
	private double price;
	private ShirtSize size;
	
	public Shirt(String brand, double price, ShirtSize size) {
		this.brand = brand;
		this.price = price;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ShirtSize getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", price=" + price + ", size=" + size + "]";
	}

}

public class DemoEnum {

	
	public static void main(String[] args) {
	
		ShirtSize shirtSize=ShirtSize.valueOf("M");
		
		switch (shirtSize) {
		case S:
			break;

		case M:
			break;

			
		case XL:
			break;

		default:
			break;
		}
		
		
		//enum can be used for switch case
		// int, String, char, shortint, enum
		
		
		// how to convert a string to enum
		
		//ShirtSize shirtSize=ShirtSize.valueOf("M");
		
		//System.out.println(shirtSize);
		
		//String shirtSizeString=ShirtSize.M.name();
		
		
		//values help to all constants of enum
		//ShirtSize[] shirtSizes=ShirtSize.values();
		
		//for(ShirtSize size: shirtSizes) {
		//	System.out.println(size.name());
		//}
		
		//ShirtSize shirtSize=ShirtSize.M;
	
		//System.out.println(shirtSize.getSize());
		//Shirt shirt=new Shirt("PE", 2300, shirtSize);
		//System.out.println(shirt);
		
	}
}




