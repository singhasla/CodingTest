package STEP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step5_04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] count = new int[42];
		int cnt = 0;

		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			count[a % 42] += 1;
		}

		for (int i = 0; i < 42; i++) {
			if (count[i] >= 1)
				cnt += 1;
		}

		bw.write(String.valueOf(cnt));

		br.close();
		bw.flush();
		bw.close();
	}

}