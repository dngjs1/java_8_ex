package com.woohun.a1;

public class StudentView {
	//학생들의 정보를 출력
	//4번
	public void view(Student[] stu) {
		for(int i=0;i<stu.length;i++) {
			System.out.println("이름 : "+stu[i].name);
			System.out.println("번호 : "+stu[i].num);
			System.out.println("국어성적 : "+stu[i].kor);
			System.out.println("영어성적 : "+stu[i].eng);
			System.out.println("수학성적 : "+stu[i].math);
			System.out.println("총점 : "+stu[i].total);
			System.out.println("평균 : "+stu[i].avg);
			System.out.println("---------------");
		}
	}
}
