package B;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B_Easter_Eggs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        //red, orange, yellow, green, blue, indigo or violet
        String []colors1={"O","Y","G"};
        String []colors2={"B","I","V"};
        boolean first=true;
        boolean second=false;
        //ROYGRBIV
        //ROYGBIVGBIVYG
        int index1=0,index2=0;
        String[]output=new String[size+1];
        Arrays.fill(output,"");
        output[0]="R";
        for(int i=1;i<size/2+1;i++){
            if(size%2==0 && i==(size/2)){
                output[i]="R";
                break;
            }
            if(first && !second){
                output[i]=colors1[index1];
                output[size-i]=colors2[index1];
                index1++;
                if(index1==3){
                    first=false;
                    second=true;
                    index1=0;
                }
            }
            else if(second &&!first){
                output[i]=colors2[index1];
                output[size-i]=colors1[index1];
                index1++;
                if(index1==3){
                    first=true;
                    second=false;
                    index1=0;
                }
            }
        }
        for(String a:output){
            System.out.print(a);
        }
    }
}
