package B;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B_Sort_the_Array {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        boolean isSorted=false;
        int index=0;
        int first=0,last=0;
        for(int i=0;i<size;i++) {
            int num=input.nextInt();
            if(i!=0 && num<arr.get(arr.size()-1) && !isSorted ){
                if(index==0){
                    isSorted = true;
                    first=i;
                    index=1;
                    if(i==size-1)last=i+1;
                }
                else index=10;
            }
            else if(i!=0 && isSorted && (num>arr.get(arr.size()-1) || i==size-1) ){
                isSorted=false;
                if(i==size-1 && num<arr.get(arr.size()-1)){
                    last=i+1;
                }
                else {
                    last = i;
                }
                if(first-2>=0&&num<arr.get(first-2)) {
                    index = 10;
                }

                if(num>arr.get(arr.size()-1)&& num>arr.get(last-1) && num<arr.get(first-1) && last!=0){
                    index=10;
                }
            }
            arr.add(num);
        }
        if(index==0){
            System.out.println("yes");
            System.out.print(1+" "+1);
        }
        else if(index==1){
            System.out.println("yes");
            System.out.print(first+" "+last);
        }
        else {
            System.out.println("no");
        }
    }
}
