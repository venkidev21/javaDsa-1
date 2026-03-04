package dsa;

public class peak {
          public static void main(String[] args) {
        	  int mat[][] = {{70,50,40,30,20},{100,1,2,3,4}};
        	 
        	  for(int i=0;i<mat.length;i++) {
        		  boolean f=true;
        		  
        		  int temp=findpeak(mat[i]);
        		  System.out.println(mat[i][temp]);
                  
        		  
        		  if( i>0 && mat[i][temp]<mat[i-1][temp]) f=false;
        		  if( i<mat.length-1 && mat[i][temp]<mat[i+1][temp]) f=false;
        			  
        		  if(f) {
        			  System.out.println(i+" "+temp);
        			
        			 break;
        		  }
        	  }
//        	  System.out.println(l+" "+k);
          }
          static int findpeak(int arr[]) {
        	  int s=0;
        	  int e=arr.length-1;
        	  while(s<e) {
        		  int mid=(s+e)/2;
        		  if(arr[mid]>arr[mid+1]) e=mid;
        		  else s=mid+1;
        	  }
        	  return s;
          }
}
