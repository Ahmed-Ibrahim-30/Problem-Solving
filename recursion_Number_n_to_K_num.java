import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;



public class recursion_Number_n_to_K_num {
    static int getSum(Stack<Integer> arr,int finalSum){
        int sum=0;
        int index=arr.size()-1;
        //System.out.print(arr +"  index = "+index+"  ");
        for(int i:arr){
            sum+=i;
        }
        //System.out.println("  sum = "+sum);
        if(sum==finalSum)System.out.println("Output = "+arr);
        return sum;
    }
    static Stack<Integer> storeIndex=new Stack<>();
    static ArrayList<Integer>storeResult=new ArrayList<>();
    static int fun(int n,int k,int firstK,int finalSum){
        if(k==0) {
            int sum=getSum(storeIndex,finalSum);
            storeIndex.pop();
            return sum;
        }
        for(int i=1;i<n;i++){
            storeIndex.add(n-i);
            int sum=fun(n-i,k-1,firstK,finalSum);
            if(sum!=0) storeResult.add(sum);
        }
        if(storeIndex.size()<firstK) {
            if(k!=firstK)storeIndex.pop();
            return 0;
        }
        int sum=getSum(storeIndex,finalSum);
        if(k!=firstK)storeIndex.pop();
        return sum;
    }

    public static void main(String[] args) {
        fun(10,3,3,7);
        //System.out.println(storeResult);
    }
}
/*
Given a list of positive integer Items whose elements are guaranteed to be in sorted ascending order,
and a positive integer Goal, and Output is a list of three elements [A,B,C] taken from items that
together add up to goal. The Output must occur inside the items list in that order (ascending order).
?-threeSum([3,8,9,10,12,14],27,Output).
Output=[8,9,10];
Output=[3,10,14]






 */