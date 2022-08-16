package A;

import java.util.Scanner;

public class A_Dubstep {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String text=input.next();
        String[]subtext=text.split("WUB");
        int g=0;
        for(String i:subtext) {
            g++;
            if(!i.equals("")) {
                System.out.print(i);
                if(g<subtext.length)System.out.print(" ");
            }

        }
    }
}
