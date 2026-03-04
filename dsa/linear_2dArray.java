package dsa;
import java.util.*;
public class linear_2dArray {
     public static void main(String[] args) {
    	 int arr[][]= {
    			 {1,2,3,4},
    			 {12,34,5,67},
    			 {1,2,34,5,}
    	 };
    	 System.out.println(Arrays.toString(lens(arr,67)));
     }
     public static int[] lens(int arr[][],int k) {
    	 int c=0;
    	 for(int i=0;i<arr.length;i++) {
    		 for(int j=0;j<arr[i].length;j++) {
    			 c++;
    			 if(arr[i][j]==k) return new int[]{i,j};
    		 }
    		     	 }
    	 return new int[]{-1,-1};

     }
}
