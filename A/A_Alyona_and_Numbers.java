package A;

import java.util.Scanner;

public class A_Alyona_and_Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        long result=0;
        for(int i=1;i<=n;i++){
            int first=i/5;  result-=first;
            int second=m/5; result+=second;
            int third=((i+m)/5)-second; result+=third;
        }
        System.out.println(result);
    }
}
