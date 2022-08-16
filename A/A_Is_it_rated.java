package A;

import java.util.Scanner;

public class A_Is_it_rated {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int [][]arr=new int[size][2];
        boolean changed=false,small=false;
        int smallnumber=100000;
        for(int i=0;i<size;i++){
            arr[i][0]=input.nextInt(); arr[i][1]=input.nextInt();
            if(smallnumber<arr[i][0]){
                small=true;
            }
            if(!small&& smallnumber>arr[i][0])smallnumber=arr[i][0];

            if(arr[i][0]!=arr[i][1])changed=true;
        }
        if(changed)System.out.println("rated");
        else if(small)System.out.println("unrated");
        else System.out.println("maybe");
    }
}
