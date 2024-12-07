package abasics;

public class A3Armstrong {
	
	public static boolean isAmstrong(String number) {
		char[] terms = number.toCharArray();
		int n = number.length();
		int actual = Integer.parseInt(number);
		int expected = 0;
		for(char term : terms) {
			expected += Math.pow(term - '0', n);
		}
		
		return expected == actual ? true : false;
	}
	
	public static void main(String[] args) {
		System.out.println(isAmstrong("153") ? "Yes it is an Armstrong" : "No it is not an Armstrong");
	}
}
