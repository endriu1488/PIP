package mini_tema;

//definire metode apelate de Concrete Builder

public interface MeniuBuilder {
	
	public void buildBautura();
	public void buildBurger();
	public void buildSalata();
	public void buildGarnitura();
	public void buildWrap();
	public void buildPui();
	public void buildPret();
	public Meniu getMeniu();
	
}
