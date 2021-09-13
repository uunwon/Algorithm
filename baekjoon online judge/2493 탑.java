import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < num; i++) // 스택 채워넣기
			stack.add(Integer.parseInt(st.nextToken()));
		
		while(num-- != 0){
			int build = stack.pop();
			int temp = 0;

			for(int i = num; i > 0; i--) {
				if(build <= stack.elementAt(i-1)) {
					sb.append(i).append(" ");
					temp++;
					break;
				}
			}
			if(temp == 0)
				sb.append(0).append(" ");
		}
		System.out.println(sb);
	}
}