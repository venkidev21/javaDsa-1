package dsa;
import java.util.*;
public class Array2Darray {

	public static void main(String[] args) {
		int arr[][]= {
				{1,2,34},
				{12},
				{5,8,9} };
//		for loop
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]*=2;
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		//arrays .to sting
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//			
//		}
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}
		

	}

}
