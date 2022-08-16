package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Launch_of_Collider {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        String direction=input.next();
        ArrayList<Integer>all=new ArrayList<>();
        ArrayList<Character>dir=new ArrayList<>();
        ArrayList<Integer>Output=new ArrayList<>();
        for(int i=0;i<size;i++){
            all.add(input.nextInt());
        }
        for(char c:direction.toCharArray())dir.add(c);
        for (int i=0;i<dir.size();i++) {
            if(i!=dir.size()-1 &&dir.get(i)=='R' && dir.get(i+1)=='L'){
                Output.add((all.get(i+1)-all.get(i))/2);
            }
        }
        if(Output.isEmpty()){
            System.out.println(-1);
            return;
        }
        Collections.sort(Output);
        System.out.println(Output.get(0));
    }
}
