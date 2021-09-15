package javaPractice;
import java.io.*;
import java.util.*;

public class code {
	public static int solve(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();
		int answer = 0;

		for(int i = 0; i < len; i++) {
			char c = s.charAt(i);

			if(c == '(' || c == '[')
				stack.push(c);

			else if(c == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
					answer += 2;
				}
				else
					return 0;
			}

			else if(c == ']') {
				if(!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
					answer += 2;
				}
				else
					return 0;

			}
		}

		if(stack.isEmpty())
			return answer;
		else
			return 0;
	}

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		System.out.println(solve(s));
	}
}