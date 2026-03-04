package dsa;
import java.util.*;

public class spiral {

	public static void main(String[] args) {
		
		int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
		List<Integer> ls=new LinkedList<>();
        int top=0;
        int bot=matrix.length-1;
        int lef=0;
        int rig=matrix[0].length-1;
        int  rs=matrix.length*matrix[0].length;
        while(ls.size()<rs-1){
            //top
            for(int i=lef;i<rig;i++){
                ls.add(matrix[top][i]);
            }
            top++;
            //top-bot
            for(int i=top;i<bot;i++){
                ls.add(matrix[i][rig]);
            }
            rig--;
            for(int i=rig;i>=lef;i--){
                ls.add(matrix[bot][i]);
            }
            bot--;
            for(int i=bot;i>=top;i--){
                ls.add(matrix[i][lef]);
            }
            lef++;

	}
        System.out.println(ls);
	}

}
