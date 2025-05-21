package list1;

import java.util.ArrayList;
import java.util.Arrays;

public class E2 {
	public static void main(String []args) {
		ArrayList<String> array2 = new ArrayList<>();
		//adding elements
		array2.addAll(Arrays.asList("Red","Blue","green","Orange"));
		//geeting elements
		String element1 = array2.get(0);
		String element2 = array2.get(1);
		String element3 = array2.get(2);
		String element4 = array2.get(3);
		System.out.print("elements are: "+element1+","+","+element2+","+element3+","+element4);
		//removing second element
		String elem = array2.remove(1);
		System.out.println("\nthe remove of second element is: "+elem);
	}
}
