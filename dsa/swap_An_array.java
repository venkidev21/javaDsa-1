package dsa;
import java.util.*;
public class swap_An_array {

	public static void main(String[] args) {
		int arr[]= {1,2,34,5,67};
		swap(arr,2,3);
		System.out.println(Arrays.toString(arr));
		

	}
	public static void swap(int arr[],int i1,int i2) {
		int temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
		
	}

}
