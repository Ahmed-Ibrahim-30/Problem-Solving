package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Good_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int a=input.nextInt();
        ArrayList<Integer>alldigit=new ArrayList<>();
        int result=0;
        boolean bad=false;
        for(int i=0;i<size;i++){
            String num=input.next();
            for(char d:num.toCharArray()){
                int intDigit=d-48;
                if (intDigit<=a && !alldigit.contains(intDigit)){
                    alldigit.add(intDigit);
                }
            }

            if(!alldigit.isEmpty()){
                Collections.sort(alldigit);
                if(alldigit.size()==a+1 && alldigit.get(0)==0){
                    result++;
                }
                alldigit.clear();
            }
        }
        System.out.println(result);
    }
}
