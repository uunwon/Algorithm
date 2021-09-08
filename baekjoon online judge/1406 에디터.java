import java.io.*;
import java.util.*;

// StringBuffer 이용해서 출력하기
// https://lotuslee.tistory.com/33
public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
			int num = Integer.parseInt(br.readLine());

			Stack<String> lstack = new Stack<>();
			Stack<String> rstack = new Stack<>();

			for(int i = 0; i < str.length(); i++)
				lstack.push(str.substring(i,i+1));

			for(int i = 0; i < num; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String com = st.nextToken();

				switch(com) {
					case "L" : 
						if(!lstack.isEmpty()) rstack.push(lstack.pop());
						break;
					case "D" : 
						if(!rstack.isEmpty()) lstack.push(rstack.pop());
						break;
					case "B" : 
						if(!lstack.isEmpty()) lstack.pop();
						break;
					case "P" : 
						lstack.push(st.nextToken());
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
}