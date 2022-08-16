package A;

import java.util.Scanner;

public class A_Panoramixs_Prediction {
    public static boolean isPrime(long num){
        if(num==1)return false;
        for(long i=2;i<10 && i!=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long num1=input.nextLong();
        long num2=input.nextLong();
        if(isPrime(num2)){
            long firstPrime=0;
            for(long i=num1+1;i<=num2;i++){
                if(isPrime(i)){
                    firstPrime=i;
                    break;
                }
            }
            if(firstPrime==num2){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
