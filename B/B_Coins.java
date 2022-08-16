package B;

import java.util.Scanner;

public class B_Coins {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String one=input.next();
        String two=input.next();
        String three=input.next();

        int A=0,B=0,C=0; int index=0;

        if(one.charAt(1)=='<'){ index=2; }

        if(one.charAt(index)=='A')A++;
        else if(one.charAt(index)=='B')B++;
        else if(one.charAt(index)=='C')C++;

        index=0;

        if(two.charAt(1)=='<'){ index=2;}
        if(two.charAt(index)=='A')A++;
        else if(two.charAt(index)=='B')B++;
        else if(two.charAt(index)=='C')C++;

        index=0;

        if(three.charAt(1)=='<'){
            index=2;
        }
        if(three.charAt(index)=='A')A++;
        else if(three.charAt(index)=='B')B++;
        else if(three.charAt(index)=='C')C++;

        if(C<A && C<B) {
            System.out.print('C');
            if(A>B) {
                System.out.print('B');
                System.out.print('A');
            }
            if(A<B) {
                System.out.print('A');
                System.out.print('B');
            }
        }
        else if(B<A && B<C) {
            System.out.print('B');
            if(A>C) {
                System.out.print('C');
                System.out.print('A');
            }
            if(A<C) {
                System.out.print('A');
                System.out.print('C');
            }
        }
        else if(A<C && A<B) {
            System.out.print('A');
            if(C>B) {
                System.out.print('B');
                System.out.print('C');
            }
            if(C<B) {
                System.out.print('C');
                System.out.print('B');
            }
        }
        else System.out.print("Impossible");

    }
}
