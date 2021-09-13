import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		while(num-- != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String com = st.nextToken();
			
			switch(com) {
				case "push" :
					queue.add(Integer.parseInt(st.nextToken()));
					break;
				case "pop" :
					if(!queue.isEmpty()) sb.append(queue.removeFirst()).append("\n");
					else sb.append(-1).append("\n");
					break;
				case "size" :
					sb.append(queue.size()).append("\n");
					break;
				case "empty" :
					if(queue.isEmpty()) sb.append(1).append("\n");
					else sb.append(0).append("\n");
					break;
				case "front" :
					if(!queue.isEmpty()) sb.append(queue.peekFirst()).append("\n");
					else sb.append(-1).append("\n");
					break;
				case "back" : 
					if(!queue.isEmpty()) sb.append(queue.peekLast()).append("\n");
					else sb.append(-1).append("\n"); 
					break;
			}
		}
		System.out.println(sb);
	}
}