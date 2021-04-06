// 9012 괄호
package projectJob;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine()); // 입력 데이터의 수
		
		while(T-- != 0) {
			Stack<Character> stack = new Stack<>();
			String st = br.readLine();
			
			for(int i = 0; i < st.length(); i++) {
				if(!stack.isEmpty() && stack.peek() == '(' && st.charAt(i) == ')')
					stack.pop();
				else
					stack.push(st.charAt(i));
			}
			
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}