import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ary = new ArrayList<>();
		int answer = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());

		for(int i = 0; i < len; i++) // 배열에 숫자들 넣기
			ary.add(i+1);

		StringTokenizer stArray = new StringTokenizer(br.readLine());
		for(int i = 0; i < cnt; i++) {
			int num = Integer.parseInt(stArray.nextToken());
			int idx = ary.indexOf(num);

			if(idx < ary.size() - idx) {
				for(int j = 0; j < idx; j++) {
					ary.add(ary.remove(0));
					answer++;
				}
			}
			else {
				for(int j = 0; j < ary.size() - idx; j++) {
					ary.add(0, ary.remove(ary.size() - 1));
					answer++;
				}
			}
			ary.remove(0);
		}

		System.out.println(answer);
	}
}