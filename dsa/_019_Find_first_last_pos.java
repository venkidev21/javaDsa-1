package dsa;

public class _019_Find_first_last_pos {

	public static void main(String[] args) {
		int ans[]= {-1,-1};
		int arr[]= {5,5,7,7,7,7,8,8,8,8,9,9,9,9,9};
		int s=find(arr,8,true);
		int e=find(arr,8,false);
		ans[0]=s;
		ans[1]=e;
		
		System.out.print(ans[0]+" "+ans[1]);
		

	}
 public static int find(int arr[],int k,boolean findstar) {
	 int ans=-1;
	 int s=0;
	 int e=arr.length-1;
	 int mid=0;
	 while(s<=e) {
		 mid=(s+e)/2;
		 
		 if(arr[mid]>k) e=mid-1;
		 else if(arr[mid]<k) s=mid+1;
		 else {
			 ans=mid;
			 if(findstar) {
				 e=mid-1;
			 }
			 else {
				 s=mid+1;
			 }
		 }
	 }
	 return ans;
	 
 }
}
