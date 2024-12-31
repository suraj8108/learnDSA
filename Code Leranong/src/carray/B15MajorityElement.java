package carray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B15MajorityElement {
	
	public static void findElement(List<Integer> elements) {
		int elem1 = Integer.MIN_VALUE;
		int elem2 = Integer.MIN_VALUE;
		int count1 = 0;
		int count2 = 0;
		
		for(int element : elements) {
			if(count1 == 0 && element != elem2) {
				count1 = 1;
				elem1 = element;
			}
			else if(count2 == 0 && element != elem1) {
				count2 = 1;
				elem2 = element;
			} else if(elem1 == element) {
				count1++;
			} else if(elem2 == element) {
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		System.out.println("Elements are " + elem1 + " " + elem2);
	}
	
	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<>();
		
		Collections.addAll(elements, 1,2,2,3,2);
		findElement(elements);
	}
}
