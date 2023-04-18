package nicotheeagle.destiny.armi;

public class Arma {
	
	private String name;
	private GunType tipoArma;
	private AmmoType tipoMuni;
	private int impatto;
	private int gittata;
	private int stabilita;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GunType getTipoArma() {
		return tipoArma;
	}
	public void setTipoArma(GunType tipoArma) {
		this.tipoArma = tipoArma;
	}
	public AmmoType getTipoMuni() {
		return tipoMuni;
	}
	public void setTipoMuni(AmmoType tipoMuni) {
		this.tipoMuni = tipoMuni;
	}
	public int getImpatto() {
		return impatto;
	}
	public void setImpatto(int impatto) {
		this.impatto = impatto;
	}
	public int getGittata() {
		return gittata;
	}
	public void setGittata(int gittata) {
		this.gittata = gittata;
	}
	public int getStabilita() {
		return stabilita;
	}
	public void setStabilita(int stabilita) {
		this.stabilita = stabilita;
	}
	
	
}
