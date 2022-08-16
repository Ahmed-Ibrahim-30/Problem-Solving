package A;

import java.util.Scanner;

public class A_Arpas_hard_exam_and_Mehrdads_naive_cheat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(n==0){
            System.out.println(1);
            return;
        }
        int []digit= {8, 4, 2, 6};
        int divisible=(n%4)-1;
        if (divisible==-1)divisible=3;
        System.out.println(digit[divisible]);
    }
}
