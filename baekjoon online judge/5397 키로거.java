import java.io.*;
import java.util.*;

public class Main {
	public static void find_password(String str) {
		Stack<String> lstack = new Stack<>();
		Stack<String> rstack = new Stack<>();

		for(int i = 0; i < str.length(); i++) {
			String com = str.substring(i, i+1);

			switch(com) {
				case "<" : 
					if(!lstack.isEmpty()) rstack.push(lstack.pop());
					break;
				case ">" : 
					if(!rstack.isEmpty()) lstack.push(rstack.pop());
					break;
				case "-" : 
					if(!lstack.isEmpty()) lstack.pop();
					break;
				default : 
					lstack.push(com);
					break;
			}
		}

		StringBuffer sb = new StringBuffer();
		
		while(!lstack.isEmpty())
			sb.append(lstack.pop());

		String res1 = sb.reverse().toString();
		sb = new StringBuffer();
		
		while(!rstack.isEmpty())
			sb.append(rstack.pop());
		String res2 = sb.toString();

		System.out.println(res1 + res2);
	}

    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		while(num-- != 0)
			find_password(br.readLine());
	}
}