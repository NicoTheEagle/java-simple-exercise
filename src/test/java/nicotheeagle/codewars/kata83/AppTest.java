package nicotheeagle.codewars.kata83;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
	public void minTest() {
		Integer[] arr = new Integer[] {-52, 56, 30, 29, -54, 0, -110};
		int expected = -110;
		
		int min = App.min(new ArrayList<>(Arrays.asList(arr)));
		
		assertEquals(expected, min);
	}

	@Test
	public void maxTest() {
		Integer[] arr = new Integer[] {-52, 56, 30, 29, -54, 0, -110};
		int expected = 56;
		
		int max = App.max(new ArrayList<>(Arrays.asList(arr)));
		
		assertEquals(expected, max);
	}
}
