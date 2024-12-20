package aapract;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PractStream {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {2,4,1,2,4,5,6,34,24,55};
		List<Integer> element = Arrays.asList(arr);
		
		List<Integer> stElement1 = element.stream().filter(n -> n%2 == 0).map(n -> n/2).collect(Collectors.toList());
		System.out.println(stElement1);
		
		Integer stElement2 = element.stream().reduce(0,(x, y) -> {
			return x+y;
			});
		System.out.println(stElement2);
	}
}
