package A;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Yaroslav_and_Permutations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<Integer>numbers=new ArrayList<>();
        for(int i=0;i<size;i++)numbers.add(input.nextInt());
        int count=0;
        while (count<size){
            for(int i=0;i<size-2;i++){
                if(numbers.get(i).equals(numbers.get(i + 1)) && !numbers.get(i).equals(numbers.get(i+2))){
                    int swap=numbers.get(i+1);
                    numbers.set(i+1,numbers.get(i+2));;
                    numbers.set(i+2,swap);
                    i++;
                }
                else if(numbers.get(i+1).equals(numbers.get(i+2))&& !numbers.get(i).equals(numbers.get(i+1))){
                    int swap=numbers.get(i);
                    numbers.set(i,numbers.get(i+1));
                    numbers.set(i+1,swap);
                }

            }
            count++;
        }
        for(int i=0;i<size-1;i++){
            if(numbers.get(i).equals(numbers.get(i+1))){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
