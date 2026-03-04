package dsa;

public class linear_search {
     public static void main(String[] args) {
    	 int[] Arr= {1,2,3,4,5,6,6,7};
    	 System.out.println(lens(Arr,2,1,5));
    	 
    	 
     }
     public static int lens(int arr[],int k,int s,int e) {
    	 for(int i=s;i<=e;i++) {
    		 if(arr[i]==k) return i;
    	 }
    	 return -1;
     }
}
