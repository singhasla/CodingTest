package STEP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step5_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		double max=0, sum=0;
		
		int n = Integer.parseInt(br.readLine());
		double[] score = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<n;i++){
			score[i] = Integer.parseInt(st.nextToken());
			
			if(score[i]>max)
				max = score[i];
		}
		
		for(int i=0;i<n;i++){
			score[i] = score[i]/max*100;
			sum+=score[i];
		}
			
		bw.write(String.valueOf(sum/n));
		
		br.close();
		bw.flush();
		bw.close();
	}
	
}