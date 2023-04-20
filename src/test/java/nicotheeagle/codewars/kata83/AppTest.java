package nicotheeagle.codewars.kata83;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
	public void minTest() {
		int[] arr = new int[] {-52, 56, 30, 29, -54, 0, -110};
		int expected = -110;
		
		int min = App.min(arr);
		
		assertEquals(expected, min);
	}

	@Test
	public void maxTest() {
		int[] arr = new int[] {-52, 56, 30, 29, -54, 0, -110};
		int expected = 56;
		
		int max = App.max(arr);
		
		assertEquals(expected, max);
	}
}
