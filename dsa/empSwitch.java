package dsa;
import java.util.*;
public class empSwitch {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	String name=sc.next();
    	String dept=sc.next();
    	switch(name) {
    	case "venki" -> System.out.println("name is venki");
    	case "leo" ->System.out.println("name is leo");
    	case "det" ->{
    		switch(dept) {
    		case "IT" ->System.out.println("IT");
    		case "cse" ->System.out.println("cse");
    		}
    	}
    	default -> System.out.println("enter proper");
    	}
    }
}
