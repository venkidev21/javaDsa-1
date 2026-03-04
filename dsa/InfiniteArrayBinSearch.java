package dsa;

import java.util.Arrays;

public class InfiniteArrayBinSearch {
      public static void main(String[] args) {
    	  int arr[]= {1,2,3,4,5,6,7,8,9,12,67,86,95,67,85,45,6,7,9,4,23,45,67,45,46,57,67};
    	  Arrays.sort(arr);
    	  System.out.println("running");
    	  Bf(arr,11);
    	  
      }
      static int findSE(int arr[],int tar,boolean sk) {
    	  int s=0;
    	  int e=2;
    	  while(tar>arr[e]) {
    		  int tep=e+1;
    		  e=e+(e-s+1)*2;
    		  s=tep;
    	  }
    	 if(sk) {
    		 return s;
    	 }
    	 return e;
      }
      
      static void Bf(int arr[],int tar) {
    	  int s=findSE(arr,tar,true);
    	  int e=findSE(arr,tar,false);
    	  
    	  while(s<=e) {
    		  int mid=(s+e)/2;
    		  if(arr[mid]==tar) {
    			  System.out.println("the element found at the positiion "+mid);
    			  return;
    		  }
    		  else if(arr[mid]>tar) e=mid-1;
    		  else if(arr[mid]<tar) s=mid+1;
    	  }
    	  System.out.println("not found");
    	  
      }
      
}
