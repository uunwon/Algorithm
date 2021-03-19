// 근묵자흑
package projectJob;
import java.io.*;
import java.util.*;

class Main {
	public static void countNumber(int[] num, int k) {
		Stack<Integer> stack = new Stack<>();
		int temp = 0;
		int count = 0;
		
		for(int i = 0; i < num.length; i++) {
			if(stack.size() != k)
				stack.push(num[i]);
			
			if(stack.size() == k) {
				temp = stack.pop();
				stack.clear();
				count++;
				stack.push(temp);
			}
		}
		
		if(stack.size() > 1)
			System.out.println(count + 1);
		else
			System.out.println(count); // 하나 남았다는 건 공통적으로 근묵자흑 성공했다는 거!
									   // 물들일 숫자가 남아있지 않다는 말!
		
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		int[] num = new int[Integer.parseInt(st.nextToken())]; // 배열 할당
		Stack<Integer> stack = new Stack<>();
		
		int k = Integer.parseInt(st.nextToken()); // 선택 정수 개수
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < num.length; i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		countNumber(num, k);
	}
}