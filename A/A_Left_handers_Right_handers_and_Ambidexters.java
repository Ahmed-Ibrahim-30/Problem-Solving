package A;

import java.util.Scanner;

public class A_Left_handers_Right_handers_and_Ambidexters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int left=input.nextInt();
        int right=input.nextInt();
        int ambidexter=input.nextInt();

        if(left>right || left<right){
            int diff=Math.abs(left-right);
            if(ambidexter>diff){
                if(left>right) right+=diff; else left+=diff;
                ambidexter-=diff;
            }
            else {
                if(left>right) right+=ambidexter; else left+=ambidexter;
                ambidexter=0;
            }
        }
        if(ambidexter==0)System.out.println(Math.min(left,right)*2);
        else {
            left+=ambidexter/2;
            right+=ambidexter/2;
            System.out.println(left+right);
        }
    }
}
