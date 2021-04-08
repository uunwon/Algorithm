// 9012 괄호
package projectJob;
import java.util.*;
import java.io.*;

class Main {
	public static String makeEditor(String s, int M) throws IOException {
		Stack<Character> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < s.length(); i++) {
			stack.add(s.charAt(i));
		}
		
		int cursor = stack.size();
		
		while (M-- > 0) {
			String c = br.readLine();
			c = c.replaceAll(" " , "");
			
			switch(c.charAt(0)) {
				case 'L':
					if(cursor > 0)
						cursor--;
					break;
				case 'D':
					if(cursor < stack.size())
						cursor++;
					break;
				case 'B':
					if(cursor > -1)
						stack.remove(cursor-- - 1);
					break;
				case 'P':
					stack.add(cursor++, c.charAt(1));
					break;
			}
		}
		
		return stack.toString();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int M = Integer.parseInt(br.readLine());
		
		System.out.println(makeEditor(str, M));
	}
}