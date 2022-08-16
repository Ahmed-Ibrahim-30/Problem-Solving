package A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_Even_Odds {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        long k=input.nextLong();
        ArrayList<Long>num=new ArrayList<>();
        if(n%2==0){
            if(k<=n/2)System.out.println(2*k-1);
            else System.out.println(((k-(n/2))*2));
        }
        else {
            if(k<=(n/2)+1)System.out.println(2*k-1);
            else {
                System.out.println(((k - ((n / 2) + 1)) * 2));
            }
        }

    }
}
