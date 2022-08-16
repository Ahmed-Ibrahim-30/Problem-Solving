package A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String num=input.next();
        ArrayList<Integer>allnum=new ArrayList<>();
        int index=0;
        for(char n:num.toCharArray()){
            int c=n-48;
            if(index==0 && c==9){
                allnum.add(c);
                index++;
                continue;
            }
            int newC=9-c;
            if(newC<c)c=newC;
            allnum.add(c);
            index++;
        }
        for(int n:allnum)System.out.print(n);
    }
}
