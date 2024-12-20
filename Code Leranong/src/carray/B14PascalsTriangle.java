package carray;

import java.util.ArrayList;
import java.util.List;

public class B14PascalsTriangle {
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static void pascalsTriangleForm(int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				int num = (i - j);
				int element =  factorial(i) / (factorial(num)* factorial(j));
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
	public static void pascalsTriangle(int n) {
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i = 1; i < n; i++) {
			List<Integer> temp = new ArrayList<>();
			temp.add(1);
			for(int j = 1; j < i; j++) {
				int left = j - 1;
				int right = j;
				
				int leftElement = left < 0 ? 0 : result.get(i - 2).get(left);
				int rightElement = right >= i-1 ? 0 : result.get(i - 2).get(right);
				
//				System.out.println(i + " " + j + " " + leftElement + " " + rightElement);
				temp.add(rightElement + leftElement);
			}
			result.add(temp);
//			System.out.println(result);
		}
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int n = 6;
		pascalsTriangle(n);
		pascalsTriangleForm(n);
		
	}
}
