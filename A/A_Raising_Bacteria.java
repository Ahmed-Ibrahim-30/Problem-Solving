package A;

import java.util.Scanner;

public class A_Raising_Bacteria {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long num=input.nextLong();
        long newNum=num;
        long result=0;
        while (num>0){
            if(num%2!=0){
                result++;
                num--;
            }
            num/=2;
        }
        System.out.println(result);
    }
}
