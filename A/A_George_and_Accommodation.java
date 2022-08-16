package A;

import java.util.Scanner;

public class A_George_and_Accommodation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Size=input.nextInt();
        int [][]arr=new int[Size][2];
        for(int i=0;i<Size;i++){
            arr[i][0]=input.nextInt();
            arr[i][1]=input.nextInt();
        }
        int count=0;
        for(int i=0;i<Size;i++){
            if(arr[i][1]-arr[i][0]>=2)count++;
        }
        System.out.println(count);
    }
}
