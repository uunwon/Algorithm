// 1406 에디터
package projectJob;
import java.util.*;
import java.io.*;

class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		String str = br.readLine();
		int M = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < str.length(); i++) {
			stack.add(str.charAt(i));
		}
		
		int cursor = stack.size();
		
		while (M-- > 0) {
			String c = br.readLine().replace(" ", "");
			
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
					if(cursor > 0) {
						stack.remove(cursor - 1);
						cursor--;
					} else if (cursor == 0)
						continue;
					break;
				case 'P':
					stack.add(cursor++, c.charAt(1));
					break;
			}
		}
		
		for(int i = 0; i < stack.size(); i++)
			System.out.print(stack.get(i));
	}
}