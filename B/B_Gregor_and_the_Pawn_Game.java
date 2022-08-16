package B;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Gregor_and_the_Pawn_Game {
    public static class TestCase{
        int size;
        ArrayList<Character>Enemy=new ArrayList<>();
        ArrayList<Character>Me=new ArrayList<>();
        int Output=0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        ArrayList<TestCase>all=new ArrayList<>();
        for(int i=0;i<size;i++){
            TestCase newTest=new TestCase();
            newTest.size=input.nextInt();
            String enemy=input.next();
            String me=input.next();
            for (char c:enemy.toCharArray())newTest.Enemy.add(c);
            for (char c:me.toCharArray())newTest.Me.add(c);
            all.add(newTest);
        }
        for(TestCase testCase:all){
            for (int i=0;i<testCase.size;i++){
                if(testCase.Me.get(i)=='1'){
                    if(testCase.Enemy.get(i)=='0'){
                        testCase.Output++;
                        continue;
                    }

                    if(i!=0 && testCase.Enemy.get(i-1)=='1'){
                        testCase.Output++;
                        testCase.Enemy.set(i-1,'0');
                        continue;
                    }
                    if(i!= testCase.size-1 && testCase.Enemy.get(i+1)=='1'){
                        testCase.Output++;
                        testCase.Enemy.set(i+1,'0');
                    }
                }
            }
        }

        for (TestCase c:all) {
            System.out.println(c.Output);
        }
    }
}
