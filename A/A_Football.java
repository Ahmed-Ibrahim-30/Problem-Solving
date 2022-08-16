package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Football {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<String>arr=new ArrayList<>();
        ArrayList<Integer>Score=new ArrayList<>();
        for(int i=0;i<size;i++){
            String team=input.next();
            if(!arr.contains(team)) {
                arr.add(team);
                Score.add(1);
                continue;
            }
            Score.set(arr.indexOf(team), Score.get(arr.indexOf(team))+1);
        }
        int max=Collections.max(Score);
        System.out.print(arr.get(Score.indexOf(max)));
    }
}
