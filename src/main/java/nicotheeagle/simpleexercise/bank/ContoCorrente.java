package nicotheeagle.simpleexercise.bank;

import java.util.ArrayList;
import java.util.List;

public class ContoCorrente {
	private int saldo;
	private final List<Integer> trans = new ArrayList<Integer>();

	public void versamento(int n) {
		saldo += n;
		trans.add(n);
	}
	public void prelievo(int n) {
		saldo -= n;
		trans.add(0 - n);
	}
	public int saldo() {
		return saldo;
	}
	
	public List<Integer> getTrans() {
		return trans;
	}
	

}
