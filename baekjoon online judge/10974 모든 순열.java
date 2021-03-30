// 10974 모든 순열
// https://adrian0220.tistory.com/36
// https://kutar37.tistory.com/entry/%EC%9E%90%EB%B0%94-String-%ED%81%B4%EB%9E%98%EC%8A%A4%EC%9D%98-%EB%A9%94%EC%86%8C%EB%93%9C
// http://wawoops67.blogspot.com/2013/01/android-charsequence-string.html
// https://www.acmicpc.net/problem/10974
// https://brenden.tistory.com/10
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