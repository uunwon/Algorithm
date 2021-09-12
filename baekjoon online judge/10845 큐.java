import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<>();

		while(num-- != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String com = st.nextToken();
			
			switch(com) {
				case "push" :
					queue.add(Integer.parseInt(st.nextToken()));
					break;
				case "front" :
					if(!queue.isEmpty()) System.out.println(queue.getFirst());
					else System.out.println(-1);
					break;
				case "back" : 
					if(!queue.isEmpty()) System.out.println(queue.getLast());
					else System.out.println(-1);
					break;
				case "empty" :
					if(queue.isEmpty()) System.out.println(1);
					else System.out.println(0);
					break;
				case "pop" :
					if(!queue.isEmpty()) System.out.println(queue.removeFirst());
					else System.out.println(-1);
					break;
				case "size" :
					System.out.println(queue.size());
					break;
			}
		}
	}
}