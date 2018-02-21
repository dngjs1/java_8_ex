package com.woohun.a2;

public class Shef_Pasta {
	public Food_Pasta makePasta(int select) {
		Shef_Source sh_source = new Shef_Source();
		Food_Pasta pasta = new Food_Pasta();
		
		switch(select) {
		case 1:
			pasta.name="크림파스타";
			pasta.price=15000;
			pasta.source=sh_source.makeSource(2);
			break;
		case 2:
			pasta.name="로제파스타";
			pasta.price=20000;
			pasta.source=sh_source.makeSource(1);
			break;
		case 3:
			pasta.name="오일파스타";
			pasta.price=30000;
			pasta.source=sh_source.makeSource(3);
			break;
		default:
		}
		return pasta;
		
	}
	
}
