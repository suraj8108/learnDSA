package carray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A8MajorityElement {
	
	public static void findMajorityElement(List<Integer> arr) {
		final int[] currentElement = {Integer.MIN_VALUE};
		final int[] count = {0};
		arr.stream().forEach((element) -> {
			if(element == currentElement[0]) {
				count[0] += 1;
			} else {
				if(count[0] == 0) {
					currentElement[0] = element;
					count[0] = 1;
				} else {
					count[0]--;
				}
			}
		});
		System.out.println(currentElement[0]);
	}
	
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(List.of(2,2,4,4,4,4,4,4,2,1,2,2));
		findMajorityElement(arr);
	}

}
