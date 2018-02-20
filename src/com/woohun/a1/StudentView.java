package com.woohun.a1;

public class StudentView {
	//학생들의 정보를 출력
	//4번
	public void view(Student[] stu) {
		for(int i=0;i<stu.length;i++) {
			System.out.println("이름 : "+stu[i].name);
			System.out.println("번호 : "+stu[i].num);
			System.out.println("---------------");
		}
	}
}
