package A;

import java.util.*;

public class A_Brains_Photos {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int row=input.nextInt();
        int column=input.nextInt();
        String ch;
        boolean color=false;
        for(int i=0;i<row;i++){
            for(int g=0;g<column;g++){
                ch=input.next();
                if(!ch.equals("W") && !ch.equals("B") && !ch.equals("G"))color=true;
            }
        }
        if(color)System.out.println("#Color");
        else System.out.println("#Black&White");
    }
}
