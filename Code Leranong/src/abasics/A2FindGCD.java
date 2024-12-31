package abasics;

public class A2FindGCD {
	public static long findGCD(long a, long b) {
		System.out.println(a + " " + b);
		if(a == b) {
			return a;
		} else if(a > b) {
			return findGCD(a - b, b);
		} else {
			return findGCD(a, b - a);
		}
	}
	public static void main(String[] args) {
		System.out.printf("GCD of a Number is %d",findGCD(100000000000L, 900000000002L));
	}
}