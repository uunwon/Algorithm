// 10828 스택
package projectJob;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stk = new Stack<>();
		
		int N = Integer.parseInt(br.readLine()); // 명령의 수
		
		while(N-- != 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String command = st.nextToken();
    		
    		if(command.equals("push")) {
    			stk.add(Integer.parseInt(st.nextToken()));
    		} 
    		else if(command.equals("top")) {
    			if(stk.isEmpty()) System.out.println(-1);
    			else System.out.println(stk.peek());
    		} 
    		else if(command.equals("size")) {
    			System.out.println(stk.size());
    		} 
    		else if(command.equals("pop")) {
    			if(stk.isEmpty()) System.out.println(-1);
    			else System.out.println(stk.pop());
    		}
    		else if(command.equals("empty")) {
    			if(stk.isEmpty()) System.out.println(1);
    			else System.out.println(0);
    		}
    	}
	}
}