package dsa;
import java.util.*;
public class _023_Bsearch_2D {

	public static void main(String[] args) {
		int arr[][]= {
				{10,20,30,40},
				{15,25,35,45},
				{28,29,37,49},
				{33,34,39,50}
			};
		int tar=50;
		System.out.println(Arrays.toString(bin(arr,tar)));
		}
		

	
	static int[] bin(int arr[][],int t) {
		int row=0;
		int c=arr.length-1;
		while(row<arr[0].length && c>=0) {
			if(arr[row][c]==t) {
				return new int[] {row,c};
			}
			else if(arr[row][c]>t) {
				c--;
			}
			else row++;
		}
		return new int[] {-1,-1};
	}

}
