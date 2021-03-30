// 위장
package projectJob;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = clothes.length;
        HashMap <String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++)
        	hm.put(clothes[i][1], hm.getOrDefault(key, defaultValue));
        
        return answer;
    }
}

class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[][] clothes = {{"crowmask", "face"},
							  {"bluesunglasses", "eyewear"},
		                      {"green_turban", "headgear"},
		                      {"black_turban", "headgear"}};
		
		System.out.println(sol.solution(clothes));
	}
}