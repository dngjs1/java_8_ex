package com.woohun.a2;

import java.util.Scanner;

public class Menu {
	public void order() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.오일파스타");
		
		int select = sc.nextInt();
		
		Shef_Steak sh_steak = new Shef_Steak();
		Food_Steak steak = null;
		Shef_Pasta sh_pasta = new Shef_Pasta();
		Food_Pasta pasta = null;
		Bill bill = new Bill();
		
		if(select<4) {
			steak = sh_steak.makeSteak(select);
			bill.billSteak(steak);
		}else if(select<7) {
			pasta = sh_pasta.makePasta(select-3);
			bill.billPasta(pasta);
		}else {
			System.out.println("메뉴에 없습니다.");
		}
		/*switch(select) {
		case 1:
		case 2:
		case 3:
			steak = sh_steak.makeSteak(select);
			System.out.println(steak.name+"가 나왔습니다.");
			break;
		case 4:
		case 5:
		case 6:
			pasta = sh_pasta.makePasta(select-3);
			System.out.println(pasta.name+"가 나왔습니다.");
			break;
		}*/
	}
}
