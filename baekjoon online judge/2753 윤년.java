import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer;

		try {
			answer = Integer.parseInt(br.readLine());
			if(answer % 4 == 0 && answer % 100 != 0 || answer % 400 == 0)
				System.out.println(1);
			else
				System.out.println(0);
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}