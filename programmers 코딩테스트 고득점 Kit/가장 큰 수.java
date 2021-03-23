// 가장 큰 수
package projectJob;
import java.util.*;
// comparator 와 comparable 
// https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html
// 참고 https://ivory-room.tistory.com/43
class Solution {
	public String solution(int[] numbers) {
		String result = "";
		// int[] temp = new int[numbers.length];
		
		// while(true) {
		// 맨 앞자리 비교해서 나열하고
		// 같으면 앞자리 포함해서 비교해서 나열
			for(int i = 0; i < numbers.length; i++) {
				char temp = Integer.toString(numbers[i]).charAt(0);
				int temp2;
				
				for(int j = i; j < numbers.length; j++) {
					if(temp > Integer.toString(numbers[j]).charAt(0)) {
						temp2 = numbers[j];
						numbers[j] = numbers[i];
						temp = Integer.toString(temp2).charAt(0);
					}
				}
			}
			
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
		// }
		
		return result;
	}
}

class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers = {6, 10, 2};
		
		System.out.println(sol.solution(numbers));
	}
}