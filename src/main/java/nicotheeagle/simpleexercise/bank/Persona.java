package nicotheeagle.simpleexercise.bank;

public class Persona {
	private final String name;
	private final ContoCorrente conto = new ContoCorrente();
	
	public Persona(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public ContoCorrente getConto() {
		return conto;
	}
	
	@Override
	public String toString() {
		return "Nome: " + name + ", Saldo: " + conto.saldo();
	}
}
