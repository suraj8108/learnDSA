package abasics;

public class A4PallindromeRecursion {
	
	public static boolean checkPallindrome(String num, int index) {
		int n = num.length();
		if(index >= n/2) {
			return true;
		}
		
		if(num.charAt(index) != num.charAt(n - index - 1)) {
			return false;
		} else {
			return checkPallindrome(num, ++index);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(checkPallindrome("12321", 0) ? "Its is a pallindrome" : "Its is not a pallindrome");
	}

}
