package STEP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step5_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max=0, min=0;
		
		int t = Integer.parseInt(br.readLine());
		int[] array = new int[t];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<t;i++){
			array[i] = Integer.parseInt(st.nextToken());
			
			if(i==0){
				max=array[0];
				min=array[0];
			} 
			else if(max<=array[i])
				max=array[i];
			else if(min>=array[i])
				min=array[i];
		}
			
		bw.write(min + " " + max);
		
		br.close();
		bw.flush();
		bw.close();
	}

}
