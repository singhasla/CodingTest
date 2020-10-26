package STEP5;

import java.util.Scanner;

public class Step5_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
			int n = sc.nextInt();
			int max=0, min=0;
			int[] array = new int[n];
			
			for(int i=0;i<n;i++){
				array[i] = sc.nextInt();
				
				if(i==0){
					max=array[0];
					min=array[0];
				} 
				else if(max<=array[i])
					max=array[i];
				else if(min>=array[i])
					min=array[i];
			}
			
			System.out.println(min + " " + max);
	}

}
