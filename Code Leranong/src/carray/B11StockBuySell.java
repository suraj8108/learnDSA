package carray;

import java.util.List;

public class B11StockBuySell {
	
	public static void findStockProfit(List<Integer> arr) {
		int minElement = Integer.MAX_VALUE;
		int profitGained = 0;
		
		for(int element : arr) {
			int profit = element - minElement;
			profitGained = Math.max(profitGained, profit);
			
			minElement = Math.min(minElement, element);
		}
		
		System.out.println("Profit Gained is " + profitGained);
	}
	
	public static void main(String[] args) {
		List<Integer> arr = List.of(7,1,5,3,6,11);
		findStockProfit(arr);
		
		
	}

}
