package A;

import java.util.Scanner;
import java.util.Vector;

public class A_Mountain_Scenery {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int k=input.nextInt();
        int count=0;
        Vector<Integer>peak=new Vector<>();
        for(int i=0;i<2*size+1;i++){
            peak.add(input.nextInt());
        }

        for(int i=0;i<peak.size();i++){
            int newPeak=peak.get(i)-1;
            if(i!=0 &&i!=peak.size()-1 && newPeak>0 && newPeak>peak.get(i+1) && newPeak>peak.get(i-1)){
                peak.set(i,newPeak);
                count++;
            }
            else if (i==0 && newPeak>0 && newPeak>peak.get(i+1)){
                peak.set(i,newPeak);
                count++;
            }
            else if(i==peak.size()-1&&newPeak>0 && newPeak>peak.get(i-1)){
                peak.set(i,newPeak);
                count++;
            }
            if(count==k){
                for (int g=0;g<peak.size();g++) {
                    if(g!=peak.size()-1)System.out.print(peak.get(g)+" ");
                    else System.out.print(peak.get(g));
                }
                return;
            }
        }
    }
}
