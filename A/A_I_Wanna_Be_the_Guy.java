package A;

import java.util.*;
public class A_I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int level=input.nextInt();
        int level1=input.nextInt();
        Set<Integer>arr1=new HashSet<>();
        for(int i=0;i<level1;i++){
            arr1.add(input.nextInt()); //O(log n)
        }
        int level2=input.nextInt();
        for(int i=0;i<level2;i++){
            arr1.add(input.nextInt()); //O(log n)
        }
        int count=1;
        for(int i=0;i<level;i++){
            if(!arr1.contains(count)){//O(log n)
                System.out.println("Oh, my keyboard!");
                return;
            }
            count++;
        }
        System.out.println("I become the guy.");
    }
}
