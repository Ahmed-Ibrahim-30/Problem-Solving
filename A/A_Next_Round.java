package A;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Next_Round {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int score=input.nextInt();
        if(size<score)System.out.println(0);
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<size;i++){
            arr.add(input.nextInt());
        }
        for(int i=0;i<size;i++){
            if(i==score-1 && arr.get(i)!=0)count++;
            else {
                if(arr.get(i)>=arr.get(score-1)&& arr.get(i)!=0)count++;
            }
        }
        System.out.println(count);
    }
}
