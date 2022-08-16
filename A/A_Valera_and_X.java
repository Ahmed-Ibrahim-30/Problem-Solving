package A;

import java.util.Scanner;

public class A_Valera_and_X {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        String []chars=new String[size];
        for(int i=0;i<size;i++){
            chars[i]=input.next();
        }
        char diagonal=chars[0].charAt(0);
        char other=chars[0].charAt(1);
        if(other==diagonal){
            System.out.println("NO");
            return;
        }
        for (int i=0;i<size;i++){
            //check diagonal
            if(chars[i].charAt(i)!=diagonal || chars[i].charAt((chars.length-1)-i)!=diagonal){
                System.out.println("NO");
                return;
            }
            for (int g=0;g<size;g++){
                if(g==i || g==(chars.length-1)-i) continue;
                if(chars[i].charAt(g)!=other){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
