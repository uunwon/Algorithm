// 근묵자흑
package projectJob;
import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		Stack<Integer> stack = new Stack<>();
		int temp = 0;
		
		int size = Integer.parseInt(st.nextToken()); // 배열 크기
		int k = Integer.parseInt(st.nextToken()); // 선택 정수 개수
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++)
			stack.add(Integer.parseInt(st.nextToken()));
		
		while (!stack.empty()) {
			if(stack.size() == 1)
				break;
			
			for(int i = 0; i < k - 1; i++) {
				stack.pop();
			}
			temp++;
		}
		
		System.out.println(temp);
	}
}