package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Oath_of_the_Nights_Watch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<size;i++){
            arr.add(input.nextInt());
        }
        Collections.sort(arr);
        for(int i=1;i<size;i++){
            if(arr.get(0).equals(arr.get(i))){
                arr.remove(i);
                size--;
                i--;
            }
            else break;
        }
        for(int i=size-2;i>0;i--){
            if(arr.get(size-1).equals(arr.get(i))){
                arr.remove(i);
                size--;//4 [1,5,5,5]
                i=size-1;//2
            }
            else break;
        }
        if(arr.size()>1) System.out.println(arr.size()-2);
        else System.out.println(0);
    }
}
