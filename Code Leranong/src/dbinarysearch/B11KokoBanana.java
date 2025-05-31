package dbinarysearch;

public class B11KokoBanana {

	public static long findPilesHour(int[] arr, int h) {
		long totalHours = 0;
		
		for(int element : arr) {
			int pileHour = element / h;
			if(element % h != 0) {
				pileHour++;
			}
			
			totalHours += pileHour;
		}
		return totalHours;
	}
	
	public static int findMaxElement(int[] arr) {
		int maxElement = Integer.MIN_VALUE;
		for(int element : arr) {
			if(element > maxElement) {
				maxElement = element;
			}
		}
		return maxElement;
	}
	
	public static int minKthValue(int[] arr, int h) {
		
		int left = 1;
		int right = findMaxElement(arr); 
		
		int result = -1;
		while(left <= right) {
			int mid = ( left + right ) / 2;
			
			long pilesHour = findPilesHour(arr, mid);
			
			System.out.println(left + " " + right +  " " + pilesHour);
			
			if(pilesHour > h) {
				left = mid + 1;
			} else {
				result = mid;
				right = mid - 1;
			}
		}
//		System.out.println(left + " " + right);
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {805306368,805306368,805306368};
		
		System.out.println(minKthValue(arr, 1000000000));
	}
}
