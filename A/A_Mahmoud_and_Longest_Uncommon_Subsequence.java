package A;

import java.util.Scanner;
public class A_Mahmoud_and_Longest_Uncommon_Subsequence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.next();
        String b=input.next();
        if(a.length()>b.length())System.out.println(a.length());
        else if(b.length()>a.length())System.out.println(b.length());
        else {
            if(a.equals(b))System.out.println(-1);
            else System.out.println(a.length());
        }
    }
}
