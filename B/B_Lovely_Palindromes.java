package B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_Lovely_Palindromes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String num=input.next();
        int size=num.length();
        ArrayList<Character>pal=new ArrayList<>();
        for(char c:num.toCharArray())pal.add(c);
        int index=size-1;
        for(int i=0;i<size-1;i++){
            pal.add(num.charAt(index));
            index--;
        }
        pal.add(num.charAt(0));
        for(char c:pal)System.out.print(c);
    }
}
