package STEP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step5_06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total =0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String line = br.readLine();
			int[] ox = new int[line.length()];

			for(int j=1;j<ox.length;j++){
				if(line.charAt(0)=='O')
					ox[0]=1;
				else if(line.charAt(0)=='X')
					ox[0]=0;
				
				if(line.charAt(j)=='O')
					ox[j]=ox[j-1]+1;
				else if(line.charAt(j)=='X')
					ox[j]=0;
			}	
			
			for(int k=0;k<ox.length;k++) {
				total = total + ox[k];
			}
			
			bw.write(String.valueOf(total)+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
}