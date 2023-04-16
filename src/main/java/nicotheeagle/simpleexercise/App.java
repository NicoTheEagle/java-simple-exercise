package nicotheeagle.simpleexercise;

import nicotheeagle.simpleexercise.bank.Persona;

public class App {

	public static void main(String[] args) {
		Persona p1 = new Persona("Lorenzo");
		Persona p2 = new Persona("Nicola");
		System.out.println(p1.toString());
		p1.getConto().versamento(10);
		System.out.println(p1.toString());
		p1.getConto().prelievo(5);
		System.out.println(p1.toString());
		p1.getConto().versamento(40);
		System.out.println(p1.toString());
		p1.getConto().prelievo(5);
		System.out.println(p1.toString());

		System.out.println(p2.toString());
		p2.getConto().versamento(20);
		System.out.println(p2.toString());
		p2.getConto().prelievo(5);
		System.out.println(p2.toString());

		System.out.println("Elenco transazioni di " + p1.getName() + ": ");
		for(int transazione : p1.getConto().getTrans()) {
			System.out.println(transazione);
		}
	}
}
