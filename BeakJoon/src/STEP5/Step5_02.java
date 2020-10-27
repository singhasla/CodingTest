package STEP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Step5_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max=0, min=0;
		int[] array = new int[9];
		
		for(int i=0;i<9;i++){
			array[i] = Integer.parseInt(br.readLine());
			
			if(i==0){
				max=array[0];
				min=array[0];
			} 
			else if(max<=array[i])
				max=array[i];
			else if(min>=array[i])
				min=array[i];
		}
		
		bw.write(Integer.toString(max)+"\n");
		bw.write(Integer.toString(max_index_search(array, max)));
		
		
		br.close();
		bw.flush();
		bw.close();
	}

	private static int max_index_search(int[] array, int max) {
		
		int index=0;
		
		for(int i=0;i<9;i++){
			if(array[i] == max){
				index = i;
				break;
			}
		}
		
		return index+1;
	}

	

}
