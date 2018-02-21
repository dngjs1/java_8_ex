package com.woohun.a3;

public class Car {
	String color;
	String brand;
	int cc;
	
	public Car() {
		this("Red");//자신의 또다른 생성자를 호출, 생성자라인의 첫줄만 가능
	}
	public Car(String color) {
		this(color,"Audi");
	}
	public Car(String color,String brand) {
		this(color,brand,3000);
	}
	public Car(String color,String brand,int cc) {
		this.color=color;
		this.brand=brand;
		this.cc=cc;
	}
	
	public void info() {
		System.out.println("Color : "+color);
		System.out.println("Brand : "+brand);
		System.out.println("CC : "+cc);
		this.make();
	}
	public void make() {
		System.out.println("자동차 제작 완료");
	}
}
