// 베스트셀러
package projectJob;
import java.util.*;

class Solution {
    public ArrayList<String> solution(String[] best_seller) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> ary = new ArrayList<>();
        int temp = 0;
        
        for(String s : best_seller) {
        	if(hm.containsKey(s)) 
        		hm.put(s, hm.get(s) + 1);
        	else
        		hm.put(s, 1);
        }
        
        for(String s : hm.keySet()) {
        	if(temp < hm.get(s))
        		temp = hm.get(s);
        }
        
        for(String s : hm.keySet()) {
        	if(temp == hm.get(s))
        		ary.add(s);
        }
        
        Collections.sort(ary);
        	
        return ary;
    }
}

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		Scanner sc = new Scanner(System.in);
		String[] best_seller = new String[sc.nextInt()];
		ArrayList<String> ary = new ArrayList<>();
		
		for(int i = 0; i < best_seller.length; i++)
			best_seller[i] = sc.next();
		
		ary = sol.solution(best_seller);
		
		System.out.println(ary.get(0));
	}
}