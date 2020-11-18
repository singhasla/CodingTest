package STEP7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Step7_03 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();
		
		for (int i=(int)'a'; i<=(int)'z'; i++) {
			
			int index=0;
			
			for(int j=0;j<word.length();j++) {

				if(i != word.charAt(j))	
					index++;
				else {
					break;
				}
				
			}
			//알파벳별 최초위치 출력
			System.out.print(index + " ");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
