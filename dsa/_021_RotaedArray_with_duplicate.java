package dsa;

public class _021_RotaedArray_with_duplicate {

	public static void main(String[] args) {
		int arr[]= {2,9,2,2,2};
		int tar=2;
		int p=piv(arr);
		System.out.println(p);
		if(p==-1) {
			int n=bin(arr,tar,0,arr.length-1);
			System.out.println(n);
		}
		else if(arr[p]==tar) {
			System.out.println(p);
		}
		else if(arr[0]>=tar) {
			int n=bin(arr,tar,0,p-1);
			System.out.println(n);
			
		}
		else {
			int n=bin(arr,tar,p+1,arr.length-1);
			System.out.println(n);
			     
		}

	}
	
	static int bin(int arr[],int tar,int s,int e) {
		while(s<=e) {
			int m=(s+e)/2;
			if(arr[m]==tar) return m;
			else if(arr[m]>tar) e=m-1;
			else s=m+1;
		}
		return -1;
	}
	
	static int piv(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int m=(s+e)/2;
			if(m<arr.length && arr[m]>arr[m+1]) return m;
			else if(m>0 && arr[m]<arr[m-1]) return m-1;
			else if((s==m)&&(m==e)) {
//				skip duplicates by s++,e--
				//NOTE:chek if s and e is pivot
				//cheak s is pivot
				if(arr[s]>arr[s+1]) return s;
				s++;
				//cheak e is pivot
				if(arr[e]<arr[e-1]) return e-1;
				e--;
				
			}
			else if(arr[s]<arr[m] ||(arr[s]==arr[m] && arr[e]<arr[m])) {
				s=m+1;
			}
			else e=m-1;
		}
		return -1;
	}
	

}
