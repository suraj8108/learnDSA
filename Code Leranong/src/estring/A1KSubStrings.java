package estring;

import java.util.HashMap;
import java.util.Map;

public class A1KSubStrings {

	 public static int fixMap(Map<Character, Integer> track, String s, int right, int k) {
		 int n = s.length();
		while(right < n) {
			char term = s.charAt(right);
			if(track.size() == k && !track.containsKey(term)) {
				break;
			}
			track.put(term, track.getOrDefault(term, 0) + 1);
			right++;
		}
		return right;
	}
		
	 public static int countSubstr(String s, int k) {
			
		Map<Character, Integer> larger = new HashMap<>();
		Map<Character, Integer> smaller = new HashMap<>();		
		int left = 0;
		int largerRight = 0;
		int smallerRight = 0;
		int n = s.length();
			
		largerRight = fixMap(larger, s, largerRight, k);
		smallerRight = fixMap(smaller, s, smallerRight, k - 1);
		int result = largerRight - smallerRight;
			
		while(left < n) {
			char term = s.charAt(left);
			if(smaller.containsKey(term)) {
				if(smaller.get(term) == 1) {
					smaller.remove(term);
				}else {
					smaller.put(term, smaller.get(term) - 1);
				}
			}
			if(larger.get(term)== 1) {
				larger.remove(term);
			}else {
				larger.put(term, larger.get(term) - 1);
			}
			largerRight = fixMap(larger, s, largerRight, k);
			if(k - 1 == 0) {
				smallerRight++;
			}else {
				smallerRight = fixMap(smaller, s, smallerRight, k - 1);
			}
				
			result +=  largerRight - smallerRight ;
			if(smallerRight == n) {
				break;
			}
			left++;
		}
			
		return result;
			
	}
	public static void main(String[] args) {
		int result = countSubstr("abaaca", 1);
		System.out.println(result);
	}
}
