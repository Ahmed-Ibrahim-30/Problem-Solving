package A;

import java.util.Scanner;

public class A_Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long n=input.nextLong();
        String poly;
        int res=0;
        for (long i=0;i<n;i++){
            poly=input.next();
            if(poly.equals("Tetrahedron")){
                res+=4;
            }else if(poly.equals("Cube")){
                res+=6;
            }else if(poly.equals("Octahedron")){
                res+=8;
            }else if(poly.equals("Dodecahedron")){
                res+=12;
            }else if(poly.equals("Icosahedron")){
                res+=20;
            }
        }
        System.out.println(res);
    }
}
