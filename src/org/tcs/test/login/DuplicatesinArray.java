package org.tcs.test.login;

public class DuplicatesinArray {
	public static void main(String [] args)
	{
		 int a[]={1,2,3,3,6,6,7,7,7,8,9,10};
	        int s=a.length;
	        for(int i=0;i<s-1;i++)   
	        {
	            for(int j=i+1;j<a.length;j++)
	            {
	                if(a[i]==a[j])
	                {
	 
	                    a[i]=0;
	 
	                    //a[i]=a[j];
	                    //System.out.println(a[i]+""+a[j]);
	 
	                }
	 
	            }
	 
	        }
	        for(int i=0;i<s;i++) 
	        {
	            System.out.println(a[i]);
	 
	        }
	 
	}
}
