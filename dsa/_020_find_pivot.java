package dsa;

public class _020_find_pivot {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,11,1,2,3,4};
	    int target=11;
	    if(arr[findpiv(arr)]==target) {
	    	System.out.println( target);
	    	System.out.println(findpiv(arr));
	    	return;
	    }
	    
	    if(findpiv(arr)==-1) {
	    	 System.out.println(binsear(arr,target,0,arr.length-1));
	    }
	    else if(target>=arr[0]) {
	    	System.out.println(binsear(arr,target,0,findpiv(arr)-1));
	    }
	    else {
	    	System.out.println( binsear(arr,target,findpiv(arr)+1,arr.length-1));
	    }
	    

	}
	
	static int binsear(int arr[],int tar,int s,int e) {
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid]==tar) return mid;
			else if(arr[mid]>tar) e=mid-1;
			else s=mid+1;
		}
		return -1;
		
	}
	static int findpiv(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid=(s+e)/2;
			if(mid<arr.length-1 && arr[mid]>arr[mid+1]) return mid;
			else if(mid>1 && arr[mid]<arr[mid-1]) return mid-1;
			else if(arr[s]>=arr[mid]) e=mid-1;
			else s=mid+1;
		}
		return -1;
	}

}
