package org.tcs.test.login;

public class averageArray {

	public static void main(String[] args) {

		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		for(int s:a) {
			sum = sum+s;
			//sum++;
		}
		//System.out.println(sum);
		float m =(float) sum/a.length;
		//System.out.println(a.length);
		System.out.println(m);
		

	}

}
