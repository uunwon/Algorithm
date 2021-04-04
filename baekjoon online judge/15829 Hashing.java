// 15829. Hashing
// 해싱, 해시테이블
// https://velog.io/@adam2/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0%ED%95%B4%EC%8B%9C-%ED%85%8C%EC%9D%B4%EB%B8%94
package projectJob;
import java.util.*;
import java.io.*;

class Solution {
    public long solution(int L, String str) {
        long answer = 0;
        int r = 31;
        int M = 1234567891;
        
        for(int i = 0; i < L; i++) {
        	long temp = str.charAt(i) - 'a' + 1;
        	for(int j = 0; j < i; j++) {
        		temp *= r;
        		temp %= M;
        	}
        	answer += temp;
        	answer %= M;
        }
        
        return answer;
    }
}

class Main {
	public static void main(String[] args) throws IOException {
		Solution sol = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine()); // 문자열의 길이
		String str = br.readLine(); // 영문 소문자 문자열
		
		if(str.length() != L)
			System.out.println("문자열의 길이가 올바르지 않습니다.");
		else
			System.out.println(sol.solution(L, str));
	}
}