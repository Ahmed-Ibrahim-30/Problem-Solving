package B;

import java.util.Arrays;
import java.util.Scanner;

public class B_Burglar_and_Matches {
    static class Containers implements Comparable<Containers>{
        int matchbox, match,n;
        Containers(int matchbox1,int match1,int n){
            matchbox=matchbox1;
            match=match1;
            this.n=n;
        }

        @Override
        public int compareTo(Containers o) {
            return o.match-match;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ruchsacksize=input.nextInt();
        int size=input.nextInt();

        Containers []newlap=new Containers[size];
        for(int i=0;i<size;i++){
            newlap[i]=new Containers(input.nextInt(),input.nextInt(),ruchsacksize);
        }
        Arrays.sort(newlap);

        int allMatches=0;
        int ruchSizeTemp=ruchsacksize;

        for(int i=0;i<size;i++){
            ruchSizeTemp-=newlap[i].matchbox;//2
            if(ruchSizeTemp<=0){
                allMatches+=ruchsacksize*newlap[i].match;
                break;
            }
            else {
                allMatches+=newlap[i].matchbox*newlap[i].match;//50
                ruchsacksize=ruchSizeTemp;
            }
        }
        System.out.println(allMatches);


    }
}
