package nicotheeagle.destiny.armi;

import java.util.Random;
import java.util.function.Supplier;

public class WeaponFactory {
	
	private static class Arsenale {
		static enum FucileAPompa {
			
			// START WEAPONS LIST
			DESOLATORE_M5(() -> new Arma("Desolatore M5", GunType.FUCILE_A_POMPA, AmmoType.SPECIALI, 65, 44, 40));
			// END WEAPONS LIST
			

			private final Supplier<Arma> generatore;

			FucileAPompa(Supplier<Arma> generatore) {
				this.generatore = generatore;
			}
			
			public Arma generate() {
				return generatore.get();
			}
		}
	}
	
	public static Arma generateRandomWeapon() {
		Random random = new Random();
		int randomType = random.nextInt(0, GunType.values().length);
		GunType gunType = GunType.values()[randomType];
		Arma arma = null;
		switch (gunType) {
			case CANNONE_PORTATILE:
				return null;
			case FUCILE_A_FUSIONE:
				return null;
			case FUCILE_A_POMPA:
				int randomShotGun = random.nextInt(0, Arsenale.FucileAPompa.values().length);
				arma = Arsenale.FucileAPompa.values()[randomShotGun].generate();
				break;
			case FUCILE_AUTOMATICO:
				return null;
		}
		return customize(arma);
	}
	
	private static Arma customize(Arma arma) {
		// Edit arma in base al tipo ecc ecc;
		return arma;
	}
	
}
