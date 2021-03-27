// 10974 모든 순열
package projectJob;
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    public void solution(int N) {
    	ArrayList<String> answers = new ArrayList<>();
    	char n = String.valueOf(N).charAt(0);
    	
    	for(double i = Math.pow(10, N - 1); i < Math.pow(10, N); i++) {
    		String temp = String.valueOf(i);
    		char[] ch = temp.toCharArray();
    		int count = 0;
    		
    		for(int j = 0; j < ch.length; j++) {
    			if(ch[0] == n)
    				count++;
    			n--;
    		}
    		
    		if(count == ch.length)
    			answers.add(temp);
    	}
    	
    	for(int i = 0; i < answers.size(); i++)
    		System.out.println(answers.get(i));
    }
}

class Main {
	public static void main(String[] args) throws Exception {
		Solution sol = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		sol.solution(Integer.parseInt(br.readLine()));
	}
}