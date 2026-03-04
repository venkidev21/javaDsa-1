package dsa;

import java.util.Arrays;

public class _025_BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		bub(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void bub(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean f=true;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					f=false;
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
				
			}
			if(f) break;
		}
//		System.out.println(Arrays.toString(arr));
}
}
