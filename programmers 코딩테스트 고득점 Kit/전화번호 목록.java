// 전화번호 목록
package projectJob;
import java.util.*;

class Solution {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> hm = new HashMap<>();
        
        for(String s : phone_book) hm.put(s, "0");
        
        for(String s : hm.keySet()) {
        	for(int i = 0; i < s.length(); i++) {
        		if(hm.containsKey(s.substring(0, i)))
            		return !answer;
        	}        	
        }
        
        return answer;
    }
}

class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] phone_book = {"12","123","1235","567","88"};
		
		System.out.println(sol.solution(phone_book));
	}
}