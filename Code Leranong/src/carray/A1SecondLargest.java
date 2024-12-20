package carray;

public class A1SecondLargest {

	public static int findSecondLargest(int[] arr) {
		int maxElement = Integer.MIN_VALUE;
		int secondMax = maxElement;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxElement) {
				secondMax = maxElement;
				maxElement = arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {2,5,3,23,56,35,33,53,66,34,33};
		System.out.println("Second Max element is " + findSecondLargest(arr));
	}
}
