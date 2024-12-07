package abasics;

public class A1Pallindrome {
	public static boolean checkPallindrom(String element) {
		int n = element.length();
		int index = 0;
		while(index < n/2) {
			if(element.charAt(index) != element.charAt(n - index - 1)) {
				return false;
			}
			index++;
		}
		return true;
	}
	public static void main(String[] args) {
		String element = "12321";
		System.out.println(checkPallindrom(element) ? "Pallindrome" : "Not Pallindrome");
	}

}
