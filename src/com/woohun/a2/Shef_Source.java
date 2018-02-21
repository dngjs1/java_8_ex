package com.woohun.a2;

public class Shef_Source {
	
	public Food_Source makeSource(int select) {
		Food_Source source = new Food_Source();
		switch(select) {
		case 1:
			//Food_Source source = new Food_Source();
			source.oilName= "Olive";
			source.spiceName = "Hub";
			break;
		case 2:
			//Food_Source source = new Food_Source();
			source.oilName="Milk";
			source.spiceName="Cheese";
			break;
		case 3:
			//Food_Source source = new Food_Source();
			source.oilName="Bean";
			source.spiceName="Parsley";
			break;
		default:
		}
		
		/*Food_Source source = new Food_Source();
		source.oilName="Olive";
		source.spiceName="Hub";
		
		//oilName = "Milk"
		//spiceName = "Cheese"
*/		return source;
	}
}
