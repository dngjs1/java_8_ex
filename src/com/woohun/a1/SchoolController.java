package com.woohun.a1;

import java.util.Scanner;

public class SchoolController {
	//메서드명은 start 리턴은 x
	public void start() {
		Scanner sc = new Scanner(System.in);
		Student stu[] = null;
		StudentService stuService = new StudentService();
		StudentView stuView = new StudentView();
		boolean flag = true;
		while(flag) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 성적 입력");
			System.out.println("3. 성적 조회");
			System.out.println("4. 전체 조회");
			System.out.println("5. 종       료");

			int button = sc.nextInt();
			
			switch(button) {
			case 1:
				System.out.println("1. 학생 등록");
				stu = stuService.addStudent();
				break;
			case 2:
				System.out.println("2. 성적 입력");
				break;
			case 3:
				System.out.println("3. 성적 조회");
				break;
			case 4:
				System.out.println("4. 전체 조회");
				stuView.view(stu);
				break;
			default :
				System.out.println("5. 종       료");
				flag = false;
			}
			System.out.println("=================");
		}
		
	}
	
}
