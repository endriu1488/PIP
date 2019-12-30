package mini_tema;

public class MeniuDoubleDownBurger implements MeniuBuilder {

	private Meniu meniu;
	
	public MeniuDoubleDownBurger(){
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
		meniu.setSalata("--");
		
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
		meniu.setPui("--");
		
	}
	@Override
	public void buildPret() {
		meniu.setPret("23 RON");
		
	}
	@Override
	public Meniu getMeniu() {
		return this.meniu;
	}

	

}
