import java.io.*;
import java.util.*;

public class Main {
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();

		for(int i = 0; i < len; i++) {
			char c = s.charAt(i);

			if(c == '(')
				stack.push(c);

			else if(c == ')') {
				if(!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return "NO";
			}
		}

		if(stack.isEmpty())
			return "YES";
		else
			return "NO";
	}

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String s;

		for(int i = 0; i < num; i++) {
			s = br.readLine();
			sb.append(solve(s)).append("\n");
		}

		System.out.print(sb);
	}
}