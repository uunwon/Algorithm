import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numbers;

		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			numbers = new int[3];
			for(int i = 0; i < 3; i++)
				numbers[i] = Integer.parseInt(st.nextToken());
				
			if(numbers[0] == numbers[1] && numbers[1] == numbers[2] && numbers[2] == numbers[0])
				System.out.println(numbers[0]*1000+10000);
			else if(numbers[0] == numbers[1])
				System.out.println(numbers[0]*100+1000);
			else if(numbers[1] == numbers[2])
				System.out.println(numbers[1]*100+1000);
			else if(numbers[2] == numbers[0])
				System.out.println(numbers[0]*100+1000);
			else
				System.out.println(Math.max(numbers[0], Math.max(numbers[1], numbers[2]))*100);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}