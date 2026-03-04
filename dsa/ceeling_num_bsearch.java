package dsa;
import java.util.*;
public class ceeling_num_bsearch {

	public static void main(String[] args) {
		int arr[]= {34,5,6,7,8,10,11};
		Arrays.sort(arr);
		System.out.println(bns(arr,9));
		

	}
	public static int bns(int arr[],int k) {
		int s=0;
		int e=arr.length-1;
		int mid=0;
		while(s<=e) {
			mid=s+(e-s)/2;
			if(arr[mid]==k) {
				return arr[mid];
			}
			else if(arr[mid]>k) {
				e=mid-1;
			}
			else if(arr[mid]<k) {
				s=mid+1;
			}
		}
		return arr[mid];
	}

}
