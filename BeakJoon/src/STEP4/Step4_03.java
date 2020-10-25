package STEP4;

import java.util.Scanner;

public class Step4_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int n10=n/10;		
		int n1=n%10;
		
		int newnum=0, count=0;
		
		if(n==0)
			count++;
		
		while(n!=newnum){
			count++;
			int sum = (n10+n1)%10;
			
			newnum = n1*10 + sum;	
			
			n10=newnum/10;		
			n1=newnum%10;		
		}
		System.out.println(count);
	}

}
