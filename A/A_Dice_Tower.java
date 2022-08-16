package A;

import java.util.Scanner;
import java.util.Vector;

public class A_Dice_Tower {
    public static class Dice{
        int bottom;
        int top;
        int first;
        int second;
    }
    public static class Pair{
        int x;
        int y;
        Pair(int x,int y){this.x=x; this.y=y;};
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sizeDices=input.nextInt();
        Vector<Pair>allNumber=new Vector<>();
        allNumber.add(new Pair(1,6));
        allNumber.add(new Pair(2,5));
        allNumber.add(new Pair(3,4));

        Vector<Dice>allDices=new Vector<>(sizeDices);
        Dice newDice=new Dice();
        newDice.top=input.nextInt();
        newDice.bottom=7-newDice.top;
        newDice.first=input.nextInt();
        newDice.second=input.nextInt();
        allDices.add(newDice);
        for (int i=1;i<sizeDices;i++){
            newDice=new Dice();
            newDice.first=input.nextInt();
            newDice.second=input.nextInt();
            int index=0;
            for (int g=0;g<3;g++){
                if(newDice.first==allNumber.get(index).x||newDice.first==allNumber.get(index).y||newDice.second==allNumber.get(index).x||newDice.second==allNumber.get(index).y){
                    allNumber.remove(index);
                    continue;
                }
                index++;
            }
            int first=allNumber.get(0).x;
            int second=allNumber.get(0).y;
            if(allDices.get(i-1).bottom==first){
                newDice.top=second;
                newDice.bottom=first;
            }
            else if (allDices.get(i-1).bottom==second){
                newDice.top=first;
                newDice.bottom=second;
            }
            else {
                System.out.println("NO");
                return;
            }
            allDices.add(newDice);
            allNumber.clear();
            allNumber.add(new Pair(1,6));
            allNumber.add(new Pair(2,5));
            allNumber.add(new Pair(3,4));
        }
        System.out.println("YES");
    }
}
