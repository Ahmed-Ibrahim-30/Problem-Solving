package A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A_String_Task {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String text=input.next();
        ArrayList<Character>Vowels=new ArrayList<>(Arrays.asList(
                'A', 'O', 'Y', 'E', 'U', 'I', 'a', 'o', 'y', 'e', 'u', 'i'
        ));
        text=text.toLowerCase();
        for(char ch:text.toCharArray()){
            if(!Vowels.contains(ch)){
                System.out.print("."+ch);
            }
        }
    }
}
