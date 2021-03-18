// 암기왕
// 암기왕
package projectJob;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			HashMap<Integer, Integer> hm = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++)
				hm.put(Integer.parseInt(st.nextToken()), 0);
			
			int n2 = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n2; j++) {
	        	if(hm.containsKey(Integer.parseInt(st.nextToken())))
	        		bw.write("1\n");
	        	else
	        		bw.write("0\n");
	        }
		}
		
		bw.flush();
		br.close(); bw.close();
	}
}