package carray;

public class A5NumOccurOnce {

	public static void checkOccurence(int[] arr) {
		int element = 0;
		for(int elem : arr) {
			element ^= elem;
		}
		System.out.println(element);
	}
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,1,4,2,5,4};
		checkOccurence(arr);
	}
}
