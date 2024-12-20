package carray;

import java.util.List;
import java.util.stream.Collectors;

public class B10KadenceCyclicAlgo {

	public static void main(String[] args) {
		List<Integer> arr = List.of(4,-1,2,1);
		
		int maxElement = A9KadanesAlgorithm.kadensAlgorithm(arr);
		
		List<Integer> negateArr = arr.stream().map((num) -> num*-1).collect(Collectors.toList());
		int sum = arr.stream().reduce(0, (prev, num) -> prev+num);
		
		int negateMaxElem = A9KadanesAlgorithm.kadensAlgorithm(negateArr);
		int correctMax = sum - negateMaxElem;
		
		if(maxElement > correctMax) {
			System.out.println("Max element is " + maxElement);
		} else {
			System.out.println("Maximum Subarray Value " + correctMax);
		}
		
	}
}
