package dsa;

public class Max_of_array {

	public static void main(String[] args) {
		int arr[]= {9,35,3,4,6,7,23,8};
		System.out.println(max(arr));
		System.out.println(min(arr));

	}
	public static int max(int arr[]){
		int maxx=arr[0];
		for(int i:arr) {
			if(i>maxx) maxx=i;
		}
		return maxx;
		
	}
	public static int min(int arr[]){
		int maxx=arr[0];
		for(int i:arr) {
			if(i<maxx) maxx=i;
		}
		return maxx;
		
	}

}
