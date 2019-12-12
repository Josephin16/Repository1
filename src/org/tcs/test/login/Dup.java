package org.tcs.test.login;

public class Dup {
	
	public static void main(String[] args) {
		//System.out.println("kdj");
//		int a[] = {2,7,9,8,0,8,5,3};
//		
//		for(int i=a.length-1; i>=0; i--)
//		{
//		System.out.println(a[i]);
//		}
		
		
		int a[] = {3,3,4,5,3,4};
		
		int count = 0;
		 for(int i=0;i<a.length;i++) {
			 for(int j=1; j<a.length;j++) {
			 if(a[i] == a[j])
			 {
				
				 count++;
				// System.out.println(a[i]);
				 
			 }
			
		 }
			 System.out.println(a[i]);
		 
		
	}
		 
		// System.out.println(count);


			
	
	
}
}