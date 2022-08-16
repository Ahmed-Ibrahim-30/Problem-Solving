package A;

import java.util.Scanner;

public class A_BowWow_and_the_Timetable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String number=input.next();//100000000
        if(number.equals("0")){
            System.out.println(0);
            return;
        }
        boolean haveOne=false;
        long pow=number.length()-1;//pow
        for(int i=1;i<number.length();i++){
            if(number.charAt(i)=='1'){
                haveOne=true;
                break;
            }
        }
        if(pow%2!=0){
            System.out.println((pow+1)/2);
        }
        else {
            if(haveOne){
                System.out.println((pow+2)/2);
            }
            else System.out.println(pow/2);
        }

    }
}
