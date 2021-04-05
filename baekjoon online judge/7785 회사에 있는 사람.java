 7785 회사에 있는 사람
package projectJob;
import java.util.;
import java.io.;

class Solution {
    public void solution(int n, String[] log) {
    	ComparatorString comp = (s1, s2) - s2.compareTo(s1);
    	TreeMapString, String tm = new TreeMap(comp);
    	
    	for(int i = 0; i  n; i++) {
    		StringTokenizer st = new StringTokenizer(log[i]);
    		tm.put(st.nextToken(), st.nextToken());
    	}
    	
    	for(String s  tm.keySet()) {
    		if(tm.get(s).equals(enter))
    			System.out.println(s);
    	}
    }
}

class Main {
	public static void main(String[] args) throws IOException {
		Solution sol = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());  출입 기록의 수
		String[] log = new String[n];
		
		for(int i = 0; i  n; i++) {
			log[i] = br.readLine();
		}
		
		sol.solution(n, log);
	}
}