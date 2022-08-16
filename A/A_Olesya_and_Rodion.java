package A;

import java.util.Arrays;
import java.util.Scanner;

public class A_Olesya_and_Rodion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        String num2=input.next();
        int zeroSize=(num1-1)-(num2.length()-1);
        if(zeroSize<0)zeroSize=0;
        if(zeroSize+num2.length()!=num1) {
            System.out.println(-1);
            return;
        }
        char[]zeros=new char[zeroSize];
        Arrays.fill(zeros,'0');
        System.out.print(num2);
        for(char ch:zeros)System.out.print(ch);
    }
}
