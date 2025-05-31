package dbinarysearch;

public class B13DivisorThreshold {
	
	public static int divisorSums(int[] arr, int divisor) {
		int sum = 0;
		for(int element : arr) {
			int division = (int) element / divisor;
			if(element % division != 0) {
				division++;
			} 
			sum += division;
		}
		return sum;
	}
	
	public static int findMinMaxElem(int[] arr, boolean findMinElement) {
		int minElement = Integer.MAX_VALUE;
		int maxElement = Integer.MIN_VALUE;
		
		for(int element : arr) {
			if(element > maxElement) {
				maxElement = element;
			}
			if(element < minElement) {
				minElement = element;
			}
		}
		
		return findMinElement ? minElement : maxElement;
	}
	
	public static void findMinDivior(int[] arr, int threshold) {
		int left = findMinMaxElem(arr, false);
		int right = findMinMaxElem(arr, true);
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,5,9};
		
		int threshold = 6;
		findMinDivior(arr, threshold);
	}
}

	