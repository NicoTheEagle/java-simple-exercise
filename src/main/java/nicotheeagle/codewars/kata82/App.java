package nicotheeagle.codewars.kata82;

public class App {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,-4,7,12};
		System.out.println("Elenco array: ");
		for (int i : nums) {
			System.out.println(i);
		}
		System.out.println("La somma dei positivi è: " + sumPos(nums));
		
	}
	
	public static int sumPos(int[] arr){
        int s = 0;
        for (int i : arr)  {
            if (i > 0)
                s += i;
        }
        return s;
    }
}
