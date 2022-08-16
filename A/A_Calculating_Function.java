package A;

import java.util.Scanner;

public class A_Calculating_Function {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        long g=0;

        if(n%2==0)g=n/2;
        else g=-((n+1)/2);
        System.out.println(g);
    }
}
