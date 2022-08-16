package A;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class A_Love_Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        Vector<Integer>arr=new Vector<>();
        for(int i=0;i<size;i++)arr.add(input.nextInt());
        int output=0;
        for(int i=0;i<size;i++){
            if(arr.get(i)<=size){//2<5
                //System.out.println(arr.get(i));
                int index=arr.get(i)-1;//2
                if(arr.get(index)<=size && arr.get(index)!=(index+1)){//2<5
                    //System.out.println(arr.get(index));//2
                    int index2=arr.get(index)-1;//3
                    if(arr.get(index2)<=size && arr.get(index2)!=(index2+1)){//1
                        //System.out.println(arr.get(index2));
                        int index3= arr.get(index2)-1;//0
                        if(arr.get(index3)<=size && index3==i){
                            //System.out.println(arr.get(index3));
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
            //System.out.println("************");
        }
        System.out.println("NO");
    }
}
