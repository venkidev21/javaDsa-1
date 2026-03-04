package dsa;

import java.util.Arrays;

public class _017_left_rotate_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int k=2;
		
	    rs(arr,k);
	    System.out.println(Arrays.toString(arr));
	}
	public static void rs(int arr[],int k ) {
		k%=arr.length;
		for(int j=0;j<k;j++) {
			int e=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=e;
		}
	}

}
