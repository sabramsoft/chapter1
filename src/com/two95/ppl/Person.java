package com.two95.ppl;

public class Person implements Comparable<Person>{
	
	private String name;
	private Integer age;
	private boolean isMarried;
	private Integer height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", height=" + height + "]";
	}

}
