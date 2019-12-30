package mini_tema;

//concrete builder

public class MeniuTheBox implements MeniuBuilder {
	
private Meniu meniu;
	
	public MeniuTheBox(){
		this.meniu=new Meniu();
	}
	@Override
	public void buildBautura() {
		meniu.setBautura("0.4L");
		
	}

	@Override
	public void buildBurger() {
		meniu.setBurger("Double Down");
	}

	@Override
	public void buildSalata() {
		meniu.setSalata("Coleslaw");
		
	}

	@Override
	public void buildGarnitura() {
		meniu.setGarnitura("cartofi prafiti (portie medie)");
		
	}

	@Override
	public void buildWrap() {
		meniu.setWrap("--");
	}

	@Override
	public void buildPui() {
		meniu.setPui("3 buc. Chili Cheese Nuggets");
		
	}
	public void buildPret() {
		meniu.setPret("29 RON");
		
	}
	@Override
	public Meniu getMeniu() {
		return this.meniu;
	}

}
