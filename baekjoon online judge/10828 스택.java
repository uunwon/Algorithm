import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		while(num-- != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String com = st.nextToken();
			
			switch(com) {
				case "push" :
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "top" :
					if(!stack.isEmpty()) System.out.println(stack.peek());
					else System.out.println(-1);
					break;
				case "empty" :
					if(stack.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "pop" :
					if(!stack.isEmpty()) System.out.println(stack.pop());
					else System.out.println(-1);
					break;
				case "size" :
					System.out.println(stack.size());
					break;
			}
		}
	}
}