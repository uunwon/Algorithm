// 가장 큰 수
package projectJob;
import java.util.*;
// comparator 와 comparable 
// https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html

class Solution {
	public String solution(int[] numbers) {
		String result = "";
		String[] temp = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			temp[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(temp, new Comparator<String>() {
			@Override
				public int compare(String a, String b) {
					return (b+a).compareTo(a+b);
			}
		});
		
		if(temp[0].equals("0"))
			return "0";
		
		for(String s : temp) 
			result += s;
		
		return result;
	}
}

class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers = {3, 30, 34, 5, 9};
		
		System.out.println(sol.solution(numbers));
	}
}