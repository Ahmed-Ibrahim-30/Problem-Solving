package A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<String>state=new ArrayList<>();

        for(int i=0;i<size;i++){
            state.add(input.next());
        }

        int x=0;
        for(int i=0;i<size;i++){
            if(state.get(i).equals("++X")|| state.get(i).equals("X++"))x++;
            else if(state.get(i).equals("--X") || state.get(i).equals("X--"))x--;
        }
        System.out.println(x);
    }
}
