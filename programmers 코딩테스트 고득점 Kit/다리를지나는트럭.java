// 다리를 지나는 트럭
package projectJob;
import java.util.*;

class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 걸린 시간
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i : truck_weights) queue.add(i);
        
        while(!queue.isEmpty()) {
        	int temp = queue.poll();
        	
        	 if(temp + queue.peek() <= 10) {
        		 answer += (bridge_length - 1);
        	 } else {
        		 answer += bridge_length;
        	 }
        }
        
        return answer;
    }
}

class Main {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		
		int bridge_length = 2; // 다리 길이
		int weight = 10; // 견딜 수 있는 무게
		int[] truck_weights = {7, 4, 5, 6}; // 각 트럭 무게
		
		System.out.println(sol.solution(bridge_length, weight, truck_weights));
	}
}