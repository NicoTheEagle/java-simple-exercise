package nicotheeagle.destiny.armi;

public class Arma {
	
	private final String name;
	private final GunType tipoArma;
	private final AmmoType tipoMuni;
	private final int impatto;
	private final int gittata;
	private final int stabilita;
	
	public Arma(String name, GunType tipoArma, AmmoType tipoMuni, int gittata, int impatto, int stabilita) {
		
		this.name = name;
		this.tipoArma = tipoArma;
		this.tipoMuni = tipoMuni;
		this.impatto = impatto;
		this.gittata = gittata;
		this.stabilita = stabilita;

	}
	
	public String getName() {
		return name;
	}
	public GunType getTipoArma() {
		return tipoArma;
	}
	public AmmoType getTipoMuni() {
		return tipoMuni;
	}
	public int getImpatto() {
		return impatto;
	}
	public int getGittata() {
		return gittata;
	}
	public int getStabilita() {
		return stabilita;
	}
	
	
}
