package STEP6;

public class Step6_01 {

	public static void main(String[] args) {
		// Java: 	long sum(int[] a); (클래스 이름: Test)
		//			a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 
		//			(0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
		//리턴값: a에 포함되어 있는 정수 n개의 합
		int[] a = new int[1000000];
		int n =	0; 
		Test t = new Test();
		t.sum(a);
	}

}

class Test {
	long sum(int[] a) {
		long total=0;
		
		for(long i : a)
			total += i;
		
		return total;
		
	}
}