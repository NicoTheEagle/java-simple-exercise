package nicotheeagle.codewars.kata83;

public class App {

	public static void main(String[] args) {
		
		int[] arr = new int[] {-52, 56, 30, 29, -54, 0, -110};
		System.out.println("Elenco array: ");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("Min: " + min(arr) + " Max: " + max(arr));
		
	}
	
	public static int min(int[] list) {
	    int min = list[0];
	    for (int i : list) {
	    	if (i < min) {
	    		min = i;
	    	}
	    }
	    return min;
	}
  
	public static int max(int[] list) {
		int max = list[0];
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
