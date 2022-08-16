package A;

import java.util.Scanner;

public class A_Theatre_Square {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double n=input.nextLong();
        double m=input.nextLong();
        double a=input.nextLong();
        long row=0,column=0;
        long result=0;
        row= (long) Math.ceil(n/a);
        column=(long)Math.ceil(m/a);
        result=row*column;
        System.out.println(result);
    }
}
