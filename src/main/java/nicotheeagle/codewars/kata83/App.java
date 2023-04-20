package nicotheeagle.codewars.kata83;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int ref;
		
		System.out.println("Inserire i numeri positivi e negativi(0 per concludere): ");
		do {
			ref = sc.nextInt();
			if(ref != 0) {
				list.add(ref);
			}
		}while(ref != 0);
		sc.close();
		
		System.out.println("Elenco array: ");
		for (int i : list) {
			System.out.println(i);
		}
		System.out.println("Min: " + min(list) + " Max: " + max(list));
		
	}
	
	public static int min(ArrayList<Integer> list) {
	    int min = list.get(0);
	    for (int i : list) {
	    	if (i < min) {
	    		min = i;
	    	}
	    }
	    return min;
	}
  
	public static int max(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
