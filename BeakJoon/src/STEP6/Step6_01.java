package STEP6;

public class Step6_01 {

	public static void main(String[] args) {
		// Java: 	long sum(int[] a); (Ŭ���� �̸�: Test)
		//			a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 
		//			(0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
		//���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
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