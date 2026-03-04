package dsa;

import java.util.Arrays;

public class left_rigt_aum {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	System.out.println("Left sum is");
	System.out.println(Arrays.toString(ls(arr)));
	System.out.println("Right sum is");
	System.out.println(Arrays.toString(rs(arr)));
}
//left sum
public static int[] ls(int arr[]) {
	int lst[]=new int[arr.length];
	lst[0]=0;
	for(int i=1;i<arr.length;i++) {
		lst[i]=lst[i-1]+arr[i-1];
	}
	return lst;
}
//Right sum
public static int[] rs(int arr[]) {
	int rst[]=new int[arr.length];
	rst[rst.length-1]=0;
	for(int i=rst.length-2;i>=0;i--) {
		rst[i]=rst[i+1]+arr[i+1];
	}
	return rst;
}
}
