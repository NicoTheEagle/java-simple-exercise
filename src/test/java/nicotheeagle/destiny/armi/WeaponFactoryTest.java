package nicotheeagle.destiny.armi;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class WeaponFactoryTest {
	
	@Test
	@RepeatedTest(40)
	public void generateRandomWeaponTest() {
		assertDoesNotThrow(() -> WeaponFactory.generateRandomWeapon());
	}

}
