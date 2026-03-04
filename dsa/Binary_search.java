package dsa;
import java.util.*;
public class Binary_search {

	public static void main(String[] args) {
		
        int[] arr= {9,8,7,6,5,4,3,2};
        
        int a=2;
        if(bin(arr,a)!=-1) System.out.println("is found At the postion of :"+" "+bin(arr,a));
        else System.out.println("not found");
        
        System.out.println("hellow");
        
  
	}
	
	public static int bin(int[] arr,int k) {
		int s=0;
		int e=arr.length-1;
		
		boolean isacs = arr[s]<arr[e];
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]==k) {
				return mid;
			}
			
			if(isacs) {
				if(arr[mid]<k) {
					s=mid+1;
				}
				if(arr[mid]>k) {
					e=mid-1;
				}
			}
			else {
				if(arr[mid]<k) {
					e=mid-1;
				}
				if(arr[mid]>k) {
					s=mid+1;
				}
			}
			
			
			
			
		}
		return -1;
			
		
	}

}
