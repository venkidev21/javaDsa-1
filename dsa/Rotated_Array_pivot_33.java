package dsa;

public class Rotated_Array_pivot_33 {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,0,1,2};
		int tar=7;
		System.out.println(bs(arr,tar));
		

	}
	static int bs(int arr[],int tar) {
		int s=0;
		int e=findPiv(arr);
		//left of pivot(0-pivot)
		while(s<=e) {
			int mid=(s/e)/2;
			if(arr[mid]==tar) {
				return mid;
			}
			else  if(arr[mid]>tar) e=mid-1;
			else s=mid+1;
		}
		//right of pivot(pivot-arr.length)
		s=findPiv(arr)+1;
		e=arr.length-1;
		while(s<=e) {
			int mid=(s/e)/2;
			if(arr[mid]==tar) {
				return mid;
			}
			else  if(arr[mid]>tar) e=mid-1;
			else s=mid+1;
		}
		return -1;
			
	}
	
	
	static int findPiv(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]>arr[mid+1] && mid<arr.length-1) {
				return mid;
			}
			else if(arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			else if(arr[s]>arr[mid]) {
				e=mid-1;
			}
			else {
				s=mid+1;
			}
		}
		return -1;
	}

}
