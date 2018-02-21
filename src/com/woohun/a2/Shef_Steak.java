package com.woohun.a2;

public class Shef_Steak {
	public Food_Steak makeSteak(int select) {
		Food_Steak steak = new Food_Steak();
		Shef_Source source = new Shef_Source();
		
		switch(select) {
		case 1 :
			steak.name= "안심스테이크";
			steak.price= 30000;
			steak.source= source.makeSource(select);
			break;
		case 2 :
			steak.name= "등심스테이크";
			steak.price= 40000;
			steak.source= source.makeSource(select);
			break;
		case 3 :
			steak.name= "립스테이크";
			steak.price= 50000;
			steak.source= source.makeSource(select);
			break;
		default:
		}
		return steak;
	}
}
