package carray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B12RearrangeSignElement {

	public static void rearrange(List<Integer> arr) {
		int posIndex = 0;
		int n = arr.size();
		
		for(int i = 0; i < n; i++) {
			int currentElement = arr.get(i);
			if(currentElement >= 0) {
				int temp = currentElement;
				arr.set(i, arr.get(posIndex));
				arr.set(posIndex, temp);
				posIndex++;
			}
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, -3,-1,-2,1,2,-3);
		rearrange(arr);
	}
}
