package dbinarysearch;

public class B12BlossomHappens {

	 public static long blossomHappens(int[] bloomDay, int waitDays, int adjacent){
	        int prevBlossoms = 0;
	        long totalBouquet = 0;

	        for(int element : bloomDay){
	            if(element <= waitDays){
	                prevBlossoms++;
	            } else {
	                totalBouquet += prevBlossoms / adjacent;
	                prevBlossoms = 0;
	            }
	        }
	        totalBouquet += prevBlossoms / adjacent;
	        return totalBouquet;
	    }

	    public static int findMinElement(int[] arr){
	        int minElement = Integer.MAX_VALUE;
	        for(int element : arr){
	            if(element < minElement){
	                minElement = element;
	            }
	        }
	        return minElement;
	    }

	    public static int findMaxElement(int[] arr){
	        int maxElement = Integer.MIN_VALUE;
	        for(int element : arr){
	            if(element > maxElement){
	                maxElement = element;
	            }
	        }
	        return maxElement;
	    }

	    public static int minDays(int[] bloomDay, int m, int k) {
	        int n = bloomDay.length;
	        if(k*m > n){
	            return -1;
	        }

	        int left = findMinElement(bloomDay);
	        int right = findMaxElement(bloomDay);

	        while(left <= right){
	            int mid = (left + right) / 2;

	            long totalBlossoms = blossomHappens(bloomDay, mid, k);
	            if(totalBlossoms >= m){
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        return left;
	    }
	    
	    public static void main(String[] args) {
			int[] bloomDay = new int[] {1,10,3,10,2};
			int m = 3;
			int k = 1;
			System.out.println("Minimum days needed is" + minDays(bloomDay, m, k));
		}
}
