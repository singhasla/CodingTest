package STEP7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step7_01 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char c = br.readLine().charAt(0);
						
		System.out.println((int)c);
	
		br.close();
		bw.flush();
		bw.close();
	}
	
}
