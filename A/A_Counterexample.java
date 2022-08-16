package A;

import java.util.Scanner;

public class A_Counterexample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        long l=input.nextLong();
        long r=input.nextLong();
        long num1;
        long num2;
        long num3;

        if(l%2==0){
            num1=l;
            num2=l+1;
            num3=l+2;
        }
        else {
            num1=l+1;
            num2=l+2;
            num3=l+3;
        }
        if(num2>r || num3>r){
            System.out.println(-1);
            return;
        }
        System.out.print(num1+" "+num2+" "+num3);
    }
}
