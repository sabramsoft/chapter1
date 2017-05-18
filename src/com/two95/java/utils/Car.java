package com.two95.java.utils;

public class Car implements Comparable<Car>{
	
	private String color;
	private String model;
	private int price;
	
	
	
	public Car(String color, String model, int price) {
		super();
		this.color = color;
		this.model = model;
		this.price = price;
	}

	public void printDetails() {
		
		System.out.println("Car with "+color + " color and of model "+ model+" is driving and price is "+ price);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public int compareTo(Car o) {
//		Integer thisPrice = new Integer(this.price);
//		Integer objectPrice = new Integer(o.price);
		
		return this.color.compareTo(o.getColor());
	}
	

	 
	 

}
