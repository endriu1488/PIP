package mini_tema;

public class Meniu {
	
	private String bautura;
	private String burger;
	private String salata;
	private String garnitura;
	private String wrap;
	private String pui;
	private String pret;
	
	public void setBautura(String bautura) {
		this.bautura = bautura;
	}
	public void setBurger(String burger) {
		this.burger = burger;
	}
	public void setSalata(String salata) {
		this.salata = salata;
	}
	public void setGarnitura(String garnitura) {
		this.garnitura = garnitura;
	}
	public void setWrap(String wrap) {
		this.wrap = wrap;
	}
	public void setPui(String pui) {
		this.pui = pui;
	}
	public void setPret(String pret){
		this.pret = pret;
	}
	@Override
	public String toString() {
		return	"\n bautura: " + bautura
				+ "\n burger: " + burger
			    + "\n salata: " + salata 
				+ "\n garnitura: "+ garnitura 
				+ "\n wrap: " + wrap
				+ "\n pui: " + pui
				+ "\n pret: " + pret
				+ "\n";
	}

}


