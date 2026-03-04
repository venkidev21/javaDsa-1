package dsa;
import java.util.*;
public class _016_floor_using_bs {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.print("target: ");
	int k=sc.nextInt();
	Arrays.sort(arr);
	System.out.println(by(arr,k));

	}
	public static int by(int arr[],int k) {
		int s=0;
		int e=arr.length-1;
		int mid=0;
		while(s<=e) {
		mid=s+(e-s)/2;	
		if(arr[mid]==k) {
			return arr[mid];
		}
		else if(arr[mid]>k) e=mid-1;
		else if(arr[mid]<k) s=mid+1;
		}
		return arr[mid-1];
	}

}
