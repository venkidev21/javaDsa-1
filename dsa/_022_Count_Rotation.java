package dsa;

public class _022_Count_Rotation {

	public static void main(String[] args) {
		int arr[]= {6,7,8,9,1,2,3};
		System.out.println(piv(arr)+1);

	}
	static int piv(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int m=(s+e)/2;
			if(m<arr.length && arr[m]>arr[m+1]) return m;
			else if(m>0 && arr[m]<arr[m-1]) return m-1;
			else if(arr[s]<=arr[m])s=m+1;
			else e=m-1;
		}
		return -1;
	}

}
