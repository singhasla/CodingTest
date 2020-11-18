package STEP7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step7_02 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		String num = br.readLine();
		
		int total = 0;
		
		for (int i=0; i<count; i++) {
			total += num.charAt(i)-'0';
		}

		System.out.println(total);

		br.close();
		bw.flush();
		bw.close();
	}

}
