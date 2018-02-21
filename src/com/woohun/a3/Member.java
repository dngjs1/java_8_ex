package com.woohun.a3;

public class Member {
	String name;
	int age;
	
	public Member() {
		System.out.println("생성자 실행");
		name="iu";
		age=26;
	}
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
}
