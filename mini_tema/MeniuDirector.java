package mini_tema;

//clasa Director, creare obiect Meniu în funcție de concrete builderul ales

public class MeniuDirector {
	
	private MeniuBuilder meniuBuilder;
	
	public MeniuDirector (MeniuBuilder meniuBuilder){
		this.meniuBuilder = meniuBuilder;
	}
	
	public Meniu getMeniu()
	{
		return this.meniuBuilder.getMeniu();
	}
	
	public void buildMeniu(){
		this.meniuBuilder.buildBautura();
		this.meniuBuilder.buildBurger();
		this.meniuBuilder.buildGarnitura();
		this.meniuBuilder.buildPui();
		this.meniuBuilder.buildSalata();
		this.meniuBuilder.buildWrap();
		this.meniuBuilder.buildPret();
	}

}
