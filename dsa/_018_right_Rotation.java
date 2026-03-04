package dsa;

import java.util.Arrays;

public class _018_right_Rotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int k=2;
		rs(arr,k);
		System.out.println(Arrays.toString(arr));
	}
public static void rs(int arr[],int k) {
	k%=arr.length;
	
	for(int j=0;j<k;j++) {
		int a=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=a;
	}
}
}
