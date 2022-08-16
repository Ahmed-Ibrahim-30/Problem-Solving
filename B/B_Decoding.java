package B;

import java.util.Scanner;

public class B_Decoding {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        String word=input.next();

        char []allChar=new char[size];
        int index=0;
        boolean isOdd;
        if(size%2==0){
            isOdd=true;
            index=(size/2)-1;
        }
        else {
            isOdd = false;
            index=(size/2);
        }
        allChar[index]=word.charAt(0);
        int it=1;
        for(int i=1;i<word.length();i+=2){
            if(isOdd ){
                if(index+it<size)allChar[index+it]=word.charAt(i);
                if(index-it>=0)allChar[index-it]=word.charAt(i+1);
                it++;
            }
            else{//even
                if(index-it>=0)allChar[index-it]=word.charAt(i);
                if(index+it<size)allChar[index+it]=word.charAt(i+1);
                it++;
            }
        }
        for(Character c:allChar)System.out.print(c);
    }
}

