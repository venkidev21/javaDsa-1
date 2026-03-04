package dsa;

public class peak_index_target_1095 {
	//0,1,2,4,3,2,1 find the peak(4)
	//0,1,2,4,3,2,1
	//0-4 assending(order) using normal binary search for find 3 is not present so 
	//4-1 dending using reverse binary search

	public static void main(String[] args) {
		int mat[]= {0,1,2,4,3,2,1};
		int target=3;
		int peak=findpeak(mat);
		
		int s=0;
		int e=peak;
        int a=bin(mat,target,s,e);
        //cheak normal binary search using first hallf(0-4)
        if(a!=-1) System.out.println(a+" "+mat[a]);
        else {
        	//reverse binary search second half(4-1)
        	s=peak;
        	e=mat.length-1;
        	a=bin(mat,target,s,e);
        	System.out.println(a);
        }
        
	}
	
	static int bin(int arr[],int tar,int s,int e) {
         if(arr[s]<arr[e]) {//normal binary scearch
        	while(s<=e) {
        		 int mid=(s+e)/2;
        		 if(arr[mid]>tar) e=mid-1;
        		 else if(arr[mid]<tar) s=mid+1;
        		 else if(arr[mid]==tar) return mid;
        	}
         }
         else {// rever binary search
        	 int mid=(s+e)/2;
        	 if(arr[mid]<tar) e=mid-1;
        	 else if(arr[mid]>tar) s=mid+1;
        	 else return mid;
         }
         
         return -1;
		
		
	}
	
	static int findpeak(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<e) {
			int mid=(s+e)/2;
			if(arr[mid]>arr[mid+1]) e=mid;
			else s=mid+1;
			
		}
		return s;
	}

}
