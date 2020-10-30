package STEP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step5_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int c = Integer.parseInt(br.readLine());
		
		int total = 0, cnt=0;
		double avg = 0;
		double[] score = new double[1001];

		for (int i=0; i<c; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
