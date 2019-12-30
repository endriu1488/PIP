package mini_tema;

public class MeniuTwisterClasic  implements MeniuBuilder{
private Meniu meniu;
	
	public MeniuTwisterClasic(){
		this.meniu=new Meniu();
	}
	@Override
	public void buildBautura() {
		meniu.setBautura("0.5L");
		
	}

	@Override
	public void buildBurger() {
		meniu.setBurger("--");
	}

	@Override
	public void buildSalata() {
		meniu.setSalata("--");
		
	}

	@Override
	public void buildGarnitura() {
		meniu.setGarnitura("Dipping Fries");
		
	}
	@Override
	public void buildWrap() {
		meniu.setWrap("Twister Classic");
	}


	@Override
	public void buildPui() {
		meniu.setPui("--");
		
	}
	public void buildPret() {
		meniu.setPret("20 RON");
		
	}
	@Override
	public Meniu getMeniu() {
		return this.meniu;
	}
	
	
	
	
}
