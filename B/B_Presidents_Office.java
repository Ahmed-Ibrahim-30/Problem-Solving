package B;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Presidents_Office {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int col=input.nextInt();
        String color=input.next();

        ArrayList<String>arr=new ArrayList<>();
        for(int i=0;i<row;i++)arr.add(input.next());
        int start=0,end=0,output=0;
        char bottom=' ',top=' ',left=' ',right=' ';
        for(int i=0;i<row;i++){
            if(arr.get(i).contains(color)){
                //System.out.print(arr.get(i).indexOf(color));
                start=arr.get(i).indexOf(color);
                end=arr.get(i).indexOf(color);
                if(start>0){
                    if(arr.get(i).charAt(start-1)!='.') {
                        if(arr.get(i).charAt(start-1)!=left){
                            output++;
                            left=arr.get(i).charAt(start-1);
                        }
                        //System.out.print("left = "+arr.get(i).charAt(start-1));
                    }
                }
                for(int g=start;g<arr.get(i).length();g++){
                    if(arr.get(i).charAt(g)==color.charAt(0)){
                        if(i!=0 && arr.get(i-1).charAt(g)!='.' &&arr.get(i-1).charAt(g)!=color.charAt(0)){//check top
                            if(arr.get(i-1).charAt(g)!=top){
                                output++;
                                top=arr.get(i-1).charAt(g);
                            }
                            //System.out.print("top = "+arr.get(i-1).charAt(g));
                        }
                        if(i!=row-1 && arr.get(i+1).charAt(g)!='.' &&arr.get(i+1).charAt(g)!=color.charAt(0)){//check bottom
                            if(arr.get(i+1).charAt(g)!=bottom){
                                output++;
                                bottom=arr.get(i+1).charAt(g);
                            }
                            //System.out.print("bottom = "+arr.get(i+1).charAt(g));
                        }
                    }
                    else {
                        //System.out.println();
                        //System.out.println("Error ="+arr.get(i).charAt(g));
                        if(g!=arr.get(i).length()-1&& arr.get(i).charAt(g)!='.') {
                            if(arr.get(i).charAt(g)!=right){
                                output++;
                                right=arr.get(i).charAt(g);
                            }
                            //System.out.println("right = "+arr.get(i).charAt(g));
                        }
                        break;
                    }
                }
            }
        }
        //System.out.println();
        System.out.print(output);
    }
}
