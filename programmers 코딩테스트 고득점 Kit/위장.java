// 위장
package projectJob;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = clothes.length;
        HashMap <String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
        	String s = clothes[i][1];
        	if(hm.containsKey(s)) hm.replace(s, hm.get(s) + 1);
        	else hm.put(s, 1);
        }
        
        for(String s : hm.keySet()) {
        	System.out.println(s + " " + hm.get(s));
        }
        
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