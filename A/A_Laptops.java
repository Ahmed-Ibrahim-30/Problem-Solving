package A;

import java.util.Arrays;
import java.util.Scanner;
public class A_Laptops {
    static class laptop implements Comparable<laptop>{
        int n;
        int p;
        laptop(int price,int quality){
            n=price; p=quality;
        }
        public int compareTo(laptop o){
            return n-o.n;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        laptop []newlap=new laptop[size];
        for(int i=0;i<size;i++){
            newlap[i]=new laptop(input.nextInt(),input.nextInt());
        }
        Arrays.sort(newlap);
        for(int g=0;g<size-1;g++){
            if(newlap[g].p>newlap[g+1].p){
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
    }
}
