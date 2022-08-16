package A;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Polo_the_Penguin_and_Segments {
    public static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int k=input.nextInt();
        int distance=0;
        for(int i=0;i<size;i++){
            Pair pair=new Pair(input.nextInt(),input.nextInt());
            distance+=pair.y-pair.x+1;
        }
        int mod=distance%k;;
        if(mod==0){
            System.out.println(mod);
            return;
        }
        System.out.println(k-mod);
    }
}
