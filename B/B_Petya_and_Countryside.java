package B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Petya_and_Countryside {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();

        for(int i=0;i<size;i++)arr.add(input.nextInt());

        int count=0;
        for(int i=0;i<size;i++){
            for(int g=i;g<size;g++){
                count++;
                if(g!=size-1 && arr.get(g)<arr.get(g+1))break;
            }
            for(int g=i;g>=0;g--){
                if(g==0 || arr.get(g)<arr.get(g-1))break;
                count++;
            }
            arr2.add(count);
            count=0;
        }
        System.out.println(Collections.max(arr2));
    }
}
