package B;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Bear_and_Finding_Criminals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);;
        int cities=input.nextInt();
        int []arr=new int[cities];
        int index=input.nextInt();//3
        for(int i=0;i<cities;i++){ arr[i]=input.nextInt(); }
        int maxDistance=Math.max(cities-index,index);//6-3=3
        int output=0; int ensure=0;boolean one=false,two=false;
        index--;
        if(arr[index]==1) { output++;}
        for(int i=1;i<=maxDistance;i++){
            if((index+i)>=cities) one=true;
            else if(arr[index+i]==1){
                ensure++;
                one=true;
            }
            if((index-i) < 0) two=true;
            else if(arr[index-i]==1){
                ensure++;
                two=true;
            }
            if(one && two) output+=ensure;
            ensure=0;
            one=false; two=false;
        }
        System.out.print(output);
    }
}
