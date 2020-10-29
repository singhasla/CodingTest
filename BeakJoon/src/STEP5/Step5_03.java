package STEP5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Step5_03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int mul = a*b*c;
		
		String strNum = Integer.toString(mul);
		
		int[] count = new int[10];
		
		for(int i=0;i<strNum.length();i++){
			
			if(strNum.charAt(i)=='0') {
				count[0] = count[0]+1;
			} else if(strNum.charAt(i)=='1') {
				count[1] = count[1]+1;
			} else if(strNum.charAt(i)=='2') {
				count[2] = count[2]+1;
			} else if(strNum.charAt(i)=='3') {
				count[3] = count[3]+1;
			} else if(strNum.charAt(i)=='4') {
				count[4] = count[4]+1;
			} else if(strNum.charAt(i)=='5') {
				count[5] = count[5]+1;
			} else if(strNum.charAt(i)=='6') {
				count[6] = count[6]+1;
			} else if(strNum.charAt(i)=='7') {
				count[7] = count[7]+1;
			} else if(strNum.charAt(i)=='8') {
				count[8] = count[8]+1;
			} else if(strNum.charAt(i)=='9') {
				count[9] = count[9]+1;
			}
		}
		
		for(int i=0;i<10;i++){
			bw.write(count[i]+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
}

