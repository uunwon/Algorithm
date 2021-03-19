// 사은품 교환하기
// https://mollangpiu.tistory.com/56
package projectJob;
import java.io.*;
import java.util.*;

class Main {
	public static void changeProduct(long[] n, long[] m, int num) {
		
		for(int i = 0; i < num; i++) {
			long count = 0;
			long result1 = 0, result2 = 0;
			
			result1 = n[i] / 5;
			result2 = (n[i] + m[i]) / 12;
			
			count = (result1 <= result2) ? result1 : result2;
			
			System.out.println(count);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		long[] n = new long[num]; // 시즌 한정 음료 쿠폰 수
		long[] m = new long[num]; // 일반 음료 쿠폰 수
		
		for(int i = 0; i < num; i++) { 
			String str = br.readLine();
			StringTokenizer tk = new StringTokenizer(str);
			
			n[i] = Long.parseLong(tk.nextToken());
			m[i] = Long.parseLong(tk.nextToken());
		}
		
		changeProduct(n, m, num);
	}
}