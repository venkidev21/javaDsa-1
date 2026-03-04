package dsa;

import java.util.HashMap;
import java.util.Scanner;

public class hash_for {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> map= new HashMap<String,Integer>();
	int n=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<n;i++) {
		String k=sc.nextLine();
        int v=sc.nextInt();
        sc.nextLine();
        
    	map.put(k, v);

	}
	
	System.out.println(map);
	sc.close();
}
}
