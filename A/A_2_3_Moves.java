package A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class A_2_3_Moves {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<size;i++)arr.add(input.nextInt());
        for(int i=0;i<size;i++){
            int myNum=Math.abs(arr.get(i));
            if(myNum==1){res.add(2);continue;}
            if(myNum/3==0){
                res.add(myNum/2);
            }
            else if(myNum%3==0){
                res.add(myNum/3);
            }
            else{
                int r=myNum/3;//4
                int num=myNum-(3*r);
                if(num==1){
                    r--;//3
                    num=myNum-(3*r);//11
                }
                int r2=num/2;
                res.add(r+r2);
            }
        }
        for (Integer i:res) {
            System.out.println(i);
        }
    }
}
