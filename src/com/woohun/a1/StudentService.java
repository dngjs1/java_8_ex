package com.woohun.a1;

import java.util.Scanner;

public class StudentService {
	//학생 추가 메서드
	//메서드명 addStudent
	//학생 인원 수 입력
	//학생수만큼 이름입력 번호입력.
	//1번
	public Student[] addStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		int n = sc.nextInt();
		
		Student[] stu1 = new Student[n];
		for(int i=0;i<stu1.length;i++) {
			Student s1 = new Student();
			System.out.println("이름을 입력하세요.");
			s1.name = sc.next();
			System.out.println("번호를 입력하세요.");
			s1.num = sc.nextInt();
			stu1[i] = s1;
		}
		return stu1;
	}
	
	public Student[] addPoint(Student[] stu) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].name+" 학생의 국어점수를 입력하세요.");
			stu[i].kor = sc.nextInt();
			System.out.println(stu[i].name+" 학생의 영어점수를 입력하세요.");
			stu[i].eng = sc.nextInt();
			System.out.println(stu[i].name+" 학생의 수학점수를 입력하세요.");
			stu[i].math = sc.nextInt();
			System.out.println("----------------------------");
			stu[i].total = stu[i].kor+stu[i].eng+stu[i].math;
			stu[i].avg = (double)stu[i].total/3;
		}
		return stu;
	}
	
	public Student search(Student[] stu) {
		//번호를 입력받아 학생한명찾기
		//출력은 뷰에서
		Scanner sc = new Scanner(System.in);
		StudentView view = new StudentView();
		boolean flag=true;
		int j=0;
		while(flag) {
			System.out.println("학생 번호를 입력하세요.");
			int num = sc.nextInt();
			int i=0;
			for(i=0;i<stu.length;i++) {
				if(stu[i].num==num) {
					flag=false;
					j=i;
				}
			}
			if(flag==true) {
				System.out.println("찾는 학생이 없습니다.");
				System.out.println("-------------------");
			}
		}
		return stu[j];
	}
}
