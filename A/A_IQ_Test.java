package A;

import java.util.ArrayList;
import java.util.Scanner;

public class A_IQ_Test {
    public static ArrayList<Character>convertToChar(String s){
        ArrayList<Character>all=new ArrayList<>();
        for(char c:s.toCharArray())all.add(c);
        return all;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s1=input.next();
        String s2=input.next();
        String s3=input.next();
        String s4=input.next();
        ArrayList<Character>all=new ArrayList<>();
        all.addAll(convertToChar(s1));
        all.addAll(convertToChar(s2));
        all.addAll(convertToChar(s3));
        all.addAll(convertToChar(s4));
        int count=0;
        for(int i=0;i<=10;i++){
            if(i==3||i==7)continue;
            if(all.get(i)==all.get(i+1))count++;
            if(all.get(i)==all.get(i+4))count++;
            if(all.get(i)==all.get(i+5))count++;
            if(count>=2||count==0){
                System.out.println("YES");
                return;
            }
            count=0;
        }
        System.out.println("NO");
    }
}
