package A;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Ksenia_and_Pan_Scales {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String chara=input.next();
        String other=input.next();

        boolean shit=true;
        ArrayList<Character>right=new ArrayList<>();
        ArrayList<Character>left=new ArrayList<>();
        ArrayList<Character>otherArr=new ArrayList<>();
        for(char c:other.toCharArray())otherArr.add(c);

        for (char c:chara.toCharArray()) {
            if(c=='|'){
                shit=false;
                continue;
            }
            if (shit)right.add(c);
            else left.add(c);
        }
        int diff=0;
        int index=0;
        int one=0,two=0;
        int size=otherArr.size();
        diff=right.size()-left.size();//3
        if(diff>0){//add to left
            two+=Math.abs(diff);
            size-=two;
        }
        else if(diff<0){//add to right
            one+=Math.abs(diff);
            size-=one;
        }
        if(size<0)size=0;
        if(size%2!=0 && size!=0){
            System.out.print("Impossible");
            return;
        }
        one+=size/2;//2 right
        two+=size/2;//3 left

        for(int i=0;i<otherArr.size();i++){
            if(!left.contains(otherArr.get(i))&&right.contains(otherArr.get(i))&& two>0){
                left.add(otherArr.get(i));
                otherArr.remove(i);
                i--;
                two--;
            }
            else if(!right.contains(otherArr.get(i))&& one>0&&left.contains(otherArr.get(i))){
                right.add(otherArr.get(i));
                otherArr.remove(i);
                one--;
                i--;
            }
        }
        for(int i=0;i<otherArr.size();i++){
            if(!left.contains(otherArr.get(i))&& two>0){
                left.add(otherArr.get(i));
                otherArr.remove(i);
                i--;
                two--;
            }
            else if(!right.contains(otherArr.get(i))&& one>0){
                right.add(otherArr.get(i));
                otherArr.remove(i);
                one--;
                i--;
            }
        }

        if(right.size()!=left.size()){
            System.out.print("Impossible");
            //System.out.println("left"+left+"right = "+right);
        }
        else {
            for (char c:right) {
                System.out.print(c);
            }
            System.out.print("|");
            for (char c:left) {
                System.out.print(c);
            }
        }
    }
}
