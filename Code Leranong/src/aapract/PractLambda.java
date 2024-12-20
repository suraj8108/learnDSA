package aapract;

import java.util.Arrays;
import java.util.List;

interface AdditionOpp {
	int add(int a, int b);
}

public class PractLambda {
	
	public static void main(String[] args) {
		AdditionOpp lambdaFunc = (int a, int b) ->  a+b;
		System.out.println(lambdaFunc.add(19,19));
		
		Integer arr[] = new Integer[]{1,4,2,5,2};
		List<Integer> values = Arrays.asList(arr);
		System.out.println(values);
		values.forEach(num -> System.out.print(num + " "));
		
	}

}
