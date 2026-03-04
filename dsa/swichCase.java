package dsa;
import java.util.*;
public class swichCase {
         public static void main(String[] args) {
        	 Scanner s=new Scanner(System.in);
//        	 String s1=s.next();
//        	 switch(s1){
//        		 case "apple" -> System.out.println("red");
//        		 case "ornage" -> System.out.println("ornge color");
//        		 case "manogo" -> System.out.println("yellow");
//        		 default -> System.out.println("print valid input");
//        	 }
        	 int a=s.nextInt();
        	 switch(a) {
        	 case 1 -> System.out.println("monday");
        	 case 2-> System.out.println("tuesday");
        	 case 3-> System.out.println("wednesday");
        	 case 4-> System.out.println("thursday");
        	 case 5-> System.out.println("friday");
        	 case 6-> System.out.println("saturday");
        	 case 7 -> System.out.println("sunday");
        	 default ->System.out.println("enter vaild weak day number");
        	 }
        	 
//        	 cheak is weakdays or weakend
//        	 switch(a) {
//        	 case 1:
//        	 case 2:
//        	 case 3:
//        	 case 4:
//        	 case 5:
//        		 System.out.println("weakdays");
//        		 break;
//        	 case 6:
//        	 case 7:
//        	      System.out.println("weak");
//        	      break;
//        	 default:
//        		 System.out.println("enter proper input");
//        		 break;
//        	
//        	 }
//       simple short form
       switch(a) {
       case 1,2,3,4,5 ->System.out.println("weakday");
       case 6,7 ->System.out.println("weakend");
       default ->System.out.println("errpor da");
       }
         }
}
