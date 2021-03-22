// K번째 수
package projectJob;
import java.util.*;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] result = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1] - 1;
			int pos = commands[i][2];
			
			int[] temp = new int[end - start + 1];
			
			for(int j = 0; j < temp.length; j++) {
				temp[j] = array[start++];
			}
			Arrays.sort(temp);
			result[i] = temp[pos - 1];
		}
		
		return result;
	}
}

class Main {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = new int[commands.length];
		
		result = sol.solution(array, commands);
		
		System.out.println(Arrays.toString(result));
	}
}