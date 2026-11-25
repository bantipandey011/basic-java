package PatternPrinting;

import java.util.Scanner;

public class AtoZSquare8 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
           
            for(int j=1;j<=n;j++){
                System.out.print((char)(i%2==1 ? i+96 : i+64)+" ");

            }
            System.out.println();
            

        }

    }
    
}
