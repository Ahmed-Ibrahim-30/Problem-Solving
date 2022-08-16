package B;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Caisa_and_Pylons {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<Integer>all=new ArrayList<>();
        for(int i=0;i<size;i++){
            all.add(input.nextInt());
        }
        int dollars=0,energy=0;
        dollars+=all.get(0);//3
        for(int i=0;i<size-1;i++){
            int min=all.get(i)-all.get(i+1);
            if(min<0 && energy<Math.abs(min)){
                dollars+=Math.abs(min)-energy;
                energy=0;
            }
            else{
                energy+=min;
            }
        }
        System.out.println(dollars);
    }
}
