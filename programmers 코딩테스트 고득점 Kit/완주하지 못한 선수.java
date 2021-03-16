// 완주하지 못한 선수

package projectJob;
import java.util.*;

class Solution {
	public String solution(String[] participant, String[] completion) {
		int i = 0;
				
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(i = 0; i < completion.length; i++) {
			if(!participant[i].equals(completion[i]))
				return participant[i];
		}
		
		return participant[i];
	}
}

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(sol.solution(participant, completion));
	}
}