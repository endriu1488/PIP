package mini_tema;

	public class TestMeniu {

	public static void main(String[] args) {
		
		MeniuBuilder doubleDownBurger = new MeniuDoubleDownBurger();
		MeniuDirector director1 = new MeniuDirector (doubleDownBurger);
		director1.buildMeniu();
		Meniu meniu1 = director1.getMeniu();
		System.out.println("Double Down Burger" + meniu1);
		
		MeniuBuilder theBox = new MeniuTheBox();
		MeniuDirector director2 = new MeniuDirector (theBox);
		director2.buildMeniu();
		Meniu meniu2 = director2.getMeniu();
		System.out.println("The Box" + meniu2);
		
		MeniuBuilder twisterClasic = new MeniuTwisterClasic();
		MeniuDirector director3 = new MeniuDirector (twisterClasic);
		director3.buildMeniu();
		Meniu meniu3 = director3.getMeniu();
		System.out.println("Twister Clasic" + meniu3);
	
	}

}
