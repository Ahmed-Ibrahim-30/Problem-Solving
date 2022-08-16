package B;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Sum_of_Digits {
    static ArrayList<Integer>convert_to_digits(String num){
        ArrayList<Integer>digits=new ArrayList<>();
        for(char ch:num.toCharArray()){
            digits.add(ch-48);
        }
        return digits;
    }
    static String sumArray(ArrayList<Integer> arr){
        long sum=0;
        for(int i:arr)sum+=i;
        String out=Long.toString(sum);
        return out;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String n=input.next();
        ArrayList<Integer>digits=convert_to_digits(n);

        int output=0;
        while (digits.size()>1){
            String sum=sumArray(digits);
            digits.clear();
            digits.addAll(convert_to_digits(sum));
            output++;
        }
        System.out.println(output);

    }
}
