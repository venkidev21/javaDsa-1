package dsa;
import java.util.*;
public class swapFunc {
     public static int[] swa(int n,int n2) {
    	int temp=n;
    	n=n2;
    	n2=temp;
    	return new int[]{n,n2};
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(Arrays.toString(swa(n1,n2)));
		

	}

}
