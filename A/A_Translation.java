package A;

import java.util.Scanner;

public class A_Translation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String first=input.next();
        String second=input.next();
        int index=second.length()-1;
        if(first.length()!=second.length()) {
            System.out.println("NO");
            return;
        }
        for(int i=0;i<first.length();i++){
            if(first.charAt(i)!=second.charAt(index--)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
