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
		
		Student stu1[] = new Student[n];
		for(int i=0;i<stu1.length;i++) {
			Student s1 = new Student();
			System.out.println("이름을 입력하세요.");
			s1.name = sc.next();
			System.out.println("번호를 입력하세요.");
			s1.num = sc.nextInt();
			stu1[i] = s1;
		}
		/*Student stu1[] = new Student[n];
		for(int i=0;i<stu1.length;i++) {
			System.out.println("이름을 입력하세요.");
			stu1[i].name = sc.next();
			System.out.println("번호를 입력하세요.");
			stu1[i].num = sc.nextInt();
		}*/
		return stu1;
		
	}
}
