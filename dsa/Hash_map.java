package dsa;
import java.util.*;
public class Hash_map {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	HashMap<String,Integer> map= new HashMap<String,Integer>();
        	int n=sc.nextInt();
        	for(int i=0;i<n;i++) {
        		String k=sc.nextLine();
                Integer v=sc.nextInt();
            	sc.nextLine();
            	map.put(k, v);

        	}
        	
        	        	System.out.println(map.get(a));
        	sc.close();
        }
}
