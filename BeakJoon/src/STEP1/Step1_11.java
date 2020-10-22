package STEP1;

import java.util.Scanner;

public class Step1_11 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        
        int a100 = a/100;
        int a10 = (a-a100*100)/10;
        int a1 = a%10;
        
		int b100 = b/100;
        int b10 = (b-b100*100)/10;
        int b1 = b%10;
        
		System.out.println(a*b1);
        System.out.println(a*b10);
        System.out.println(a*b100);
        System.out.println(a*b);
	}

}
