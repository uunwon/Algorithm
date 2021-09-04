package javaPractice;
import java.util.*;

class Solution {
	public int[] solution(int[] prices) {
		int[] answer = {};
		int count = 0;
		answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] <= prices[j]) {
					count++;
				} else if (prices[i] > prices[j]) {
					count++;
					break;
				}
			}
			answer[i] = count;
			count = 0;
		}
		return answer;
	}
}

public class code {
    public static void main(String[] args) {
		Solution sol = new Solution();
		int[] prices = { 1, 2, 3, 2, 3 };

		System.out.println(Arrays.toString(sol.solution(prices)));
	}
}
