package dsa;
import java.util.*;
public class _024_Sorted2Dbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int tar=6;
		if(mat.length==1) {
			int rs[]=bs(mat,0,0,mat[0].length-1,tar);
			System.out.println(Arrays.toString(rs));
		}
		
		int s=0;
		int e=mat.length-1;
		int m=mat[0].length/2;
		
		while(s<e-1) {
			int mid=(s+e)/2;
			if(mat[mid][m]==tar) {
				System.out.print(mid+" "+m);
			}
			if(mat[mid][m]>tar) {
				e=mid;
			}
			else s=mid;
		}
		
		//to rows contains 4 part
       if(mat[s][m]==tar)	System.out.print(s+" "+m);
       if(mat[s+1][m]==tar)	System.out.print(s+1+" "+m);
       
       if(mat[s][m-1]>tar) {
    	   int rs[]=bs(mat,s,0,m-1,tar);
    	   System.out.println(Arrays.toString(rs));
       }
       if(mat[s][m+1]<tar) {
    	   int rs[]=bs(mat,s,m+1,mat[s].length-1,tar);
    	   System.out.println(Arrays.toString(rs));
       }
       if(mat[s+1][m-1]>tar) {
    	   int rs[]=bs(mat,s+1,0,m-1,tar);
    	   System.out.println(Arrays.toString(rs));
       }
       if(mat[s+1][m+1]<tar) {
    	   int rs[]=bs(mat,s+1,m+1,mat[s].length-1,tar);
    	   System.out.println(Arrays.toString(rs));
       }
       
      

	}
	//cheaking colum
	static int[] bs(int mat[][],int row,int s,int e,int t) {
		while(s<=e) {
			int m=(s+e)/2;
			if(mat[row][m]==t) return new int[]{row,m};
			else if(mat[row][m]>t) {
				e=m-1;
			}
			else s=m+1;
			
		}
		return new int[] {-1,-1};
	}

}
