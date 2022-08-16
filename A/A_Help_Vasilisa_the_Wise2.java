package A;

import java.util.Scanner;

public class A_Help_Vasilisa_the_Wise2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int r1=input.nextInt();
        int r2=input.nextInt();
        int c1=input.nextInt();
        int c2=input.nextInt();
        int d1=input.nextInt();
        int d2=input.nextInt();
        int x1=0,x2=0,x3=0,x4=0;
        boolean enter1=true,enter2=true;
        for(int i=1;i<10;i++){//x1 x3
            for(int g=1;g<10;g++){//x2 x4
                if((i+g==r1) && (-i+g==c2-d1) && (-i+g==d2-c1) && enter1){
                    x1=i;
                    x2=g;
                    enter1=false;
                }
                if((i+g==r2) && (-i+g==d1-c1) && (-i+g==c2-d2) && enter2){
                    x3=i;
                    x4=g;
                    enter2=false;
                }
            }
        }
        if(x1==0 || x2==0 ||x3==0||x4==0 || x1==x2||x1==x3||x1==x4||x2==x3||x2==x4||x3==x4){
            System.out.println(-1);
            return;
        }
        System.out.println(x1+" "+x2);
        System.out.println(x3+" "+x4);
    }
}
