package B;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class B_Effective_Approach {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        //Hashtable<Integer,Integer>arr=new Hashtable<>();
        int []arr=new int[100001];
        for(int i=0;i<size;i++){
            //arr.put(input.nextInt(),i);
            arr[input.nextInt()]=i;
        }
        int size2=input.nextInt();
        ArrayList<Integer>queries=new ArrayList<>();
        for(int i=0;i<size2;i++){queries.add(input.nextInt());}
        long vasya=0,petya=0;
        for(Integer num:queries){
            //long index=arr.get(num);
            long index=arr[num];
            vasya+=index+1;
            petya+=size-index;
        }
        System.out.println(vasya+" "+petya);
    }
}
