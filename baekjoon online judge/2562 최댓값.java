import java.io.*;

public class Main {
    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int index = 0;

		try {
			answer = Integer.parseInt(br.readLine());
			for(int i = 1; i < 9; i++) {
				int temp = Integer.parseInt(br.readLine());
				if(temp > answer) {
					answer = temp;
					index = i;
				}
			}

			System.out.println(answer + "\n" + (index+1));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}