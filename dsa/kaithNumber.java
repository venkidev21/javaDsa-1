/*
 n=197 sum=17
 
 [1 9 7] sum=17
 
 previous=1;
 l=1
 cs=(s*2)-previous----(17*2)-1=33
 
 previous=arr[l]=9
 arr[l]=33
 [17 9 7] sum=33
 
 
 sum=33
 l=2
 previous=9
 cs=(cs*2)-previous----(33*2)-9=57
 
 previous=7
 arr[l]=arr[2]=57
  [17 33 57]
  
  l==k so l=0;
   cs=(cs*2)-previous----(57*2)-7=107
   previous=17;
   arr[l]=arr[0]=cs=107
   [107 33 57] 
   
  l=1
   cs=(cs*2)-previous----(107*2)-17=197
   
   cs  ==n    return true;
   197 ==197
 
 
 Sliding window
 */







package dsa;

import java.util.*;

public class kaithNumber {

	public static void main(String[] args) {
//		long k=System.currentTimeMillis();
		long n=251133297;
		System.out.println(kaithNum(n));
//		long a=System.currentTimeMillis();
//		System.out.printf("%f",(double)((a-k)/1000));
	}
	public static boolean kaithNum(long n) {
		int digCount=0;
		//copy the n
		long digCopy=n;
		
//		count Number of digit(s)
		while(digCopy>0) {
			digCount++;
			digCopy/=10;
			
		}
		
		digCopy=n;
		
		long arr[]=new long[digCount];
		long sum=0;
		
		for(int i=digCount-1;i>=0;i--) {
			arr[i]=digCopy%10;
			sum+=arr[i];
			digCopy/=10;
		}
		
		int l=1;
		
		long previous=arr[0];
		arr[0]=sum;
		
		boolean flag=true;
		
		while(flag) {
			
			
			System.out.println(Arrays.toString(arr)+" "+ sum);
			long curSum=(sum*2)-previous;
			sum=curSum;
			previous=arr[l];
			
			if(curSum==n) return true;
			arr[l]=curSum;
			l++;
			if(l==arr.length) l=0;
			if(curSum>n) flag=false;
			
		}
		return false;
		
	}

}
