package STEP3;

import java.util.Scanner;

public class Step3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i=n;i>0;i--){
			for(int j=0;j<n;j++){
				if(j<i-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
