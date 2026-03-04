package dsa;

import java.util.Arrays;

public class changeArrayValue {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		chan(arr);
		System.out.println(Arrays.toString(arr));

	}
   public static void chan(int arr[]) {
	   arr[0]=8;
   }
}
