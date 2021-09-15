import java.io.*;
import java.util.*;

public class Main {
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();

		for(int i = 0; i < len; i++) {
			char c = s.charAt(i);

			if(c == '(' || c == '[')
				stack.push(c);

			else if(c == ')') {
				if(!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return "no";
			}

			else if(c == ']') {
				if(!stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				else
					return "no";

			}
		}

		if(stack.isEmpty())
			return "yes";
		else
			return "no";
	}

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;

		while(true) {
			s = br.readLine();

			if(s.equals("."))
				break;

			sb.append(solve(s)).append("\n");
		}

		System.out.print(sb);
	}
}