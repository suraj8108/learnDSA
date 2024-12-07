package abasics;

public class A5Prime {
	public static boolean checkPrime(int num) {
		int sqrt = (int) Math.sqrt(num);
		
		for(int i = 2; i < sqrt; i++) {
			if(num % sqrt == 0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(checkPrime(23) ? "Yes it is a prime" : "No it is not a prime");
	}
}
