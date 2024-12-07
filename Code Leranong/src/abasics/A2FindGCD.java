package abasics;

public class A2FindGCD {
	public static int findGCD(int a, int b) {
		if(a == b) {
			return a;
		} else if(a > b) {
			return findGCD(a - b, b);
		} else {
			return findGCD(a, b - a);
		}
	}
	public static void main(String[] args) {
		System.out.printf("GCD of a Number is %d",findGCD(16, 20));
	}
}