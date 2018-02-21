package com.woohun.a3;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.info();

		Car c2 = new Car("black");
		c2.info();
		
		Car c3 = new Car("Gray","Benz");
		c3.info();
		
		Car c4 = new Car("Yellow","BMW",4000);
		c4.info();
	}
}
