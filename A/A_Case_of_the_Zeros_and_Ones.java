package A;

import java.util.Scanner;

public class A_Case_of_the_Zeros_and_Ones {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        String num=input.next();
        StringBuilder MyString = new StringBuilder(num);
        int zero=0,one=0;
        for(int i=0;i<size;i++){
            if(MyString.charAt(i)=='0')zero++;
            else one++;
        }
        int dis=Math.abs(zero-one);
        System.out.println(dis);
    }
}
