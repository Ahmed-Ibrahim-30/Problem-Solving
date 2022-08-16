package A;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Snow_Footprints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int rightIndex=0,leftIndex=0,s=0,t=0;
        int rightCount=0,leftCount=0;
        boolean right=true,left=true;
        String foot=input.next();
        ArrayList<Character>allFoot=new ArrayList<>();
        for(char c :foot.toCharArray()){
            if(c=='R') {
                if(right){
                    rightIndex=foot.indexOf(c)+1;
                    right=false;
                }
                rightCount++;
            }
            else if(c=='L') {
                if (left){
                    leftIndex=foot.indexOf(c)+1;
                    left=false;
                }
                leftCount++;
            }
        }
        if(leftCount>rightCount){
            s=leftIndex+leftCount-1;
            t=leftIndex-1;
        }
        else {
            s=rightIndex;
            t=rightIndex+rightCount;
        }
        System.out.println(s+" "+t);
    }
}
